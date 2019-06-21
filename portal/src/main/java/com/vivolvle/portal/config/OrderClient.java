package com.vivolvle.portal.config;

import com.vivolvle.portal.command.TbOrders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author weilz
 * @date 2019/6/21
 */
@FeignClient(value = "order")
public interface OrderClient {
    @PostMapping("/addOrder")
    void addOrder(@RequestBody TbOrders tbOrders);
}
