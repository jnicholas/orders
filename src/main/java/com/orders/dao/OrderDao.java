package com.orders.dao;

import com.orders.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Defines both a Spring Repository Resource that exposes a REST API that conforms
 * to the HAL specification.
 */
@RepositoryRestResource
public interface OrderDao extends CrudRepository<Order, Integer>, OrderRepositoryCustom {

}
