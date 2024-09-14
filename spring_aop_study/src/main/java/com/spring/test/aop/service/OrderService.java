package com.spring.test.aop.service;

import com.spring.test.bo.aop.Order;

/**
 * @author: chao.an
 * @since: 2024-09-14 16:05
 */
public interface OrderService {

    Order createOrder(String userName, String productId);

    Order queryOrder(String userName);
}
