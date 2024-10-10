package com.spring.test.aop.service;

import com.spring.test.bo.aop.User;

/**
 * @author: chao.an
 * @since: 2024-09-14 16:19
 */
public interface UserService {

    User createUser(String userName, int age);

    User queryUser(int id);
}
