package com.frost.heart.user.controller;

import com.frost.heart.user.feign.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thousandyears
 * @date Created in 2020/9/24 14:08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/test")
    public String test(){
        return orderService.test();
    }
}
