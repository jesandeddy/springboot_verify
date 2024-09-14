package com.spring.test.aop.impl;

import com.spring.test.aop.service.UserService;
import com.spring.test.bo.aop.User;
import org.springframework.stereotype.Component;

/**
 * @author: chao.an
 * @since: 2024-09-14 18:47
 */
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String userName, int age) {
        User user = new User();
        user.setUserName(userName);
        user.setId(1L);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser(int id) {
        User user = new User();
        user.setId((long) id);
        user.setAge(19);
        user.setUserName("张三");
        return user;
    }
}
