package com.frost.heart.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thousandyears
 * @date Created in 2020/9/24 14:05
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/test")
    public String test(){
        return System.currentTimeMillis() + "：I'm Order";
    }
}
