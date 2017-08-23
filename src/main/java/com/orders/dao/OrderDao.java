package com.orders.dao;

import com.orders.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderDao extends CrudRepository<Order, Integer> {

}
