package com.orders.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OrderDaoImpl implements OrderRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public Double totalCost(Integer orderId) {

        final String query = "SELECT SUM(oi.itemCount * i.itemCost) AS totalCost " +
                "FROM OrderItem oi, Item i " +
                "WHERE oi.itemId = i.itemId AND oi.orderId = :orderId";

        // Attempted to get this to bind an OrderSummary directly, however, unable to configure bind properly.
        return entityManager.createQuery(query, Double.class)
                .setParameter("orderId", orderId)
                .getSingleResult();
    }
}
