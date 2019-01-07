package com.suxia.abandon.mapper;

import com.suxia.abandon.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {


    /**
     * 新增用户
     *
     * @param user
     */
    Integer addUser(User user);
}
