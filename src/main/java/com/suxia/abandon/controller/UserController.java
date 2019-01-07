package com.suxia.abandon.controller;

import com.suxia.abandon.domain.User;
import com.suxia.abandon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    // http://127.0.0.1:9999/user/add
    @RequestMapping("/add")
    @ResponseBody
    public User addUser() {
        User user = new User();
        user.setPassword("uihbjjk");
        user.setUsername("夏明");
        user.setPhone("1217876766");
        return userService.addUser(user);
    }

}
