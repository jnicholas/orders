package com.orders;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.orders.models.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Allows "summary" API endpoint to be discoverable from an Order's links resource.
     */
    @Bean
    public ResourceProcessor<Resource<Order>> orderProcessor() {

        return new ResourceProcessor<Resource<Order>>() {

            public Resource<Order> process(Resource<Order> resource) {
                resource.add(linkTo(methodOn(SummaryController.class).
                        getOrderSummary(resource.getContent().getOrderId())).withRel("summary"));
                return resource;
            }
        };
    }
}