package com.vivolvle.order.service;

import com.vivolvle.order.entity.TbOrders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/6/21
 */
@RestController
public interface OrderService {
    @PostMapping("/addOrder")
    void addOrder(@RequestBody TbOrders tbOrders);
}
