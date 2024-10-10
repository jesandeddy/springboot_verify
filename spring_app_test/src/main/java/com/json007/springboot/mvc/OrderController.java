package com.json007.springboot.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chao.an
 * @since: 2024-09-27 15:05
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/echo")
    public String echo() {
        return "hello";
    }
}
