package com.orders.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OrderDaoImpl implements OrderRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Double totalCost(Integer orderId) {

        // Attempted to get this to bind an OrderSummary directly, however, unable to configure bind properly.
        return entityManager.createQuery(
                "SELECT SUM(oi.itemCount * i.itemCost) AS totalCost " +
                    "FROM OrderItem oi, Item i " +
                    "WHERE oi.itemId = i.itemId AND oi.orderId = :orderId", Double.class)
                .setParameter("orderId", orderId)
                .getSingleResult();
    }
}
