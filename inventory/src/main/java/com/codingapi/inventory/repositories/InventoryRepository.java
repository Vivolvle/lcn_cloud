package com.codingapi.inventory.repositories;

import com.codingapi.inventory.entity.TbInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Component
public interface InventoryRepository extends JpaRepository<TbInventory, Object> {
    TbInventory findByItemId(Integer itemId);
}
