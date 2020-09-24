package com.frost.heart.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {
    "com.frost.heart.order.controller"
})
@EnableDiscoveryClient
@Slf4j
public class OrderProviderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderProviderApplication.class, args);
    }
}
