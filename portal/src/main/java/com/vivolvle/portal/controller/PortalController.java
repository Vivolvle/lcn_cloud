package com.vivolvle.portal.controller;

import com.codingapi.tx.annotation.TxTransaction;
import com.vivolvle.portal.command.TbInventory;
import com.vivolvle.portal.command.TbOrders;
import com.vivolvle.portal.config.InventoryClient;
import com.vivolvle.portal.config.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/6/21
 */
@RestController
public class PortalController {
    @Autowired
    private OrderClient orderClient;
    @Autowired
    private InventoryClient inventoryClient;

    @GetMapping("/add")
    @TxTransaction(isStart = true)
    public void add() {
        TbOrders tbOrders = new TbOrders();
        tbOrders.setItemId(1);
        tbOrders.setPrice(20);
        orderClient.addOrder(tbOrders);
        TbInventory tbInventory = new TbInventory();
        tbInventory.setItemId(1);
        tbInventory.setItemNum(2);
        inventoryClient.update(tbInventory);
    }
}
