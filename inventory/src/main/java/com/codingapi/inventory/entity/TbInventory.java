package com.codingapi.inventory.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Entity
@Table(name = "tb_inventory", schema = "lcn")
public class TbInventory {
    private int inventoryId;
    private Integer itemId;
    private Integer itemNum;

    @Id
    @Column(name = "inventory_id")
    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Basic
    @Column(name = "item_id")
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_num")
    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbInventory that = (TbInventory) o;
        return inventoryId == that.inventoryId &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemNum, that.itemNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, itemId, itemNum);
    }
}
