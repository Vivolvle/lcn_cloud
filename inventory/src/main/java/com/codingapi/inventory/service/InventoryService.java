package com.codingapi.inventory.service;

import com.codingapi.inventory.entity.TbInventory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/6/21
 */
@RestController
public interface InventoryService {
    @PostMapping("/update")
    void update(@RequestBody TbInventory tbInventory);
}
