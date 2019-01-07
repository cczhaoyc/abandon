package com.suxia.abandon.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     *
     * @param key
     * @return
     */
    @RequestMapping("/redisHandler/{key}")
    public String redisHandler(@PathVariable("key") String key) {
        stringRedisTemplate.opsForValue().set(key, key);
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     *
     * @param key
     * @return
     */
    @RequestMapping("/myredis/{key}")
    public Object myredis(@PathVariable("key") String key) {
        String birthday = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        User user = new User(key, birthday);
        Object jsonUser = JSONObject.toJSON(user);
        redisTemplate.opsForList().leftPush(key, jsonUser);
        List<Object> list = redisTemplate.opsForList().range(key, 0, -1);
        return JSON.toJSON(list);
    }
}
