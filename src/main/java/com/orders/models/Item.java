package com.orders.models;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private Double itemCost;

    public Item() {

    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemCost() {
        return itemCost;
    }

    public void setItemCost(Double itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (!itemId.equals(item.itemId)) return false;
        if (itemName != null ? !itemName.equals(item.itemName) : item.itemName != null) return false;
        return itemCost != null ? itemCost.equals(item.itemCost) : item.itemCost == null;
    }

    @Override
    public int hashCode() {
        int result = itemId.hashCode();
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemCost != null ? itemCost.hashCode() : 0);
        return result;
    }
}
