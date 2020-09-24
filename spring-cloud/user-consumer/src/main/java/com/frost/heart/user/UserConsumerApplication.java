package com.frost.heart.user;

import com.frost.heart.user.controller.UserController;
import com.frost.heart.user.feign.OrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.frost.heart.user.feign")
@Slf4j
public class UserConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
