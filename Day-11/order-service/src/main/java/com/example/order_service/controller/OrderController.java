package com.example.order_service.controller;

import com.example.order_service.Entity.Order;
import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        return service.saveOrder(order);
    }
}
