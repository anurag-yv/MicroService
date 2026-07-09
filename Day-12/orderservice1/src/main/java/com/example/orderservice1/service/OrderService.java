package com.example.orderservice1.service;


import com.example.orderservice1.entity.Order;
import com.example.orderservice1.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

private final OrderRepository repository;
public OrderService(OrderRepository repository){
    this.repository=repository;
}

public Order save(Order order){
    return repository.save(order);
}

public List<Order> getAll(){
    return repository.findAll();
}

}
