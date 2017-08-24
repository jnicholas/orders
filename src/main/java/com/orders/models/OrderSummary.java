package com.orders.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderSummary {

    @Id
    private Integer orderId;
    private Double totalCost;

    public OrderSummary() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderSummary summary = (OrderSummary) o;

        if (orderId != null ? !orderId.equals(summary.orderId) : summary.orderId != null) return false;
        return totalCost != null ? totalCost.equals(summary.totalCost) : summary.totalCost == null;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (totalCost != null ? totalCost.hashCode() : 0);
        return result;
    }
}
