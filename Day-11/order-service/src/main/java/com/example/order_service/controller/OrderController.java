package com.example.order_service.controller;

import com.example.order_service.Entity.Order;
import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//public class OrderController {
//
//    @Autowired
//    private OrderService service;
//
//    @PostMapping
//    public Order saveOrder(@RequestBody Order order){
//        return service.saveOrder(order);
//    }
//}

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/{product}")
    public String pay(@PathVariable String product){
        return orderService.placeOrder(product);
    }
}