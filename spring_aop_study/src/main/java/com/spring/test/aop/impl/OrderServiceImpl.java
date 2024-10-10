package com.spring.test.aop.impl;

import com.spring.test.aop.service.OrderService;
import com.spring.test.bo.aop.Order;
import org.checkerframework.checker.compilermsgs.qual.CompilerMessageKey;
import org.springframework.stereotype.Component;

/**
 * @author: chao.an
 * @since: 2024-09-14 16:23
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public Order createOrder(String userName, String productId) {
        Order order = new Order(1L, "test", 100.0);
        return order;
    }

    @Override
    public Order queryOrder(String userName) {
        Order order = new Order(1L, userName, 100.0);
        return order;
    }
}
