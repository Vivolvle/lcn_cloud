package com.vivolvle.order.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Entity
@Table(name = "tb_orders", schema = "lcn")
public class TbOrders {
    private int orderId;
    private Integer itemId;
    private Integer price;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbOrders tbOrders = (TbOrders) o;
        return orderId == tbOrders.orderId &&
                Objects.equals(itemId, tbOrders.itemId) &&
                Objects.equals(price, tbOrders.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, itemId, price);
    }
}
