package com.json007.spring.ioc;

import com.json007.spring.ioc.example.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: chao.an
 * @since: 2024-09-25 20:14
 */
public class App {

    /*public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        System.out.println(messageService.getMessage());
    }*/
}
