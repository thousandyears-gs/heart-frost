package com.frost.heart.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author thousandyears
 * @date Created in 2020/9/24 14:09
 */
@FeignClient(name = "order-provider")
public interface OrderService {
    @PostMapping("/order/test")
    String test();
}
