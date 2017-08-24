package com.orders;

import com.orders.dao.OrderDao;
import com.orders.models.Order;
import com.orders.models.OrderSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping("/summary")
public class SummaryController {

    @Autowired
    OrderDao orderDao;

    @RequestMapping(path = "/{orderId}", method = RequestMethod.GET)
    public ResponseEntity getOrderSummary(@PathVariable("orderId") Integer orderId) {
        Order order = orderDao.findOne(orderId);
        if (order != null) {
            OrderSummary summary = new OrderSummary();
            summary.setOrderId(orderId);
            summary.setTotalCost(orderDao.totalCost(orderId));

            return new ResponseEntity<>(summary, HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
