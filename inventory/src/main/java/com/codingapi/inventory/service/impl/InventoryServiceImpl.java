package com.codingapi.inventory.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.codingapi.inventory.entity.TbInventory;
import com.codingapi.inventory.repositories.InventoryRepository;
import com.codingapi.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    @Transactional
    @TxTransaction
    public void update(TbInventory tbInventory) {
        TbInventory target = inventoryRepository.findByItemId(tbInventory.getItemId());
        target.setItemNum(target.getItemNum()-tbInventory.getItemNum());
        inventoryRepository.save(target);
        //throw new RuntimeException("故意抛一个异常");
    }
}
