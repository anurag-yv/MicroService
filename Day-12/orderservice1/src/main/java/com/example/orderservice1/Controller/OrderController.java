package com.example.orderservice1.Controller;

import com.example.orderservice1.entity.Order;
import com.example.orderservice1.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return service.getAll();
    }
}
