package com.json007.spring.ioc.example;

/**
 * @author: chao.an
 * @since: 2024-09-25 20:17
 */
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
