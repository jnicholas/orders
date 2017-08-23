package com.orders.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="orders") /* avoid ORDER sql keyword */
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    private String customerName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "order_items",
        joinColumns = @JoinColumn(name = "orderId", referencedColumnName = "orderId"),
        inverseJoinColumns = @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    )
    private Set<Item> items;

    public Order() {

    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}