package com.orders.models;

import javax.persistence.*;

@Entity
@Table(name="order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderItemId;
    private Integer orderId;
    private Integer itemId;
    private Integer itemCount;

    public OrderItem() {

    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (!orderItemId.equals(orderItem.orderItemId)) return false;
        if (!orderId.equals(orderItem.orderId)) return false;
        if (!itemId.equals(orderItem.itemId)) return false;
        return itemCount.equals(orderItem.itemCount);
    }

    @Override
    public int hashCode() {
        int result = orderItemId.hashCode();
        result = 31 * result + orderId.hashCode();
        result = 31 * result + itemId.hashCode();
        result = 31 * result + itemCount.hashCode();
        return result;
    }
}
