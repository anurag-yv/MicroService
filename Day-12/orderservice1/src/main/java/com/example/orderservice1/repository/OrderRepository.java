package com.example.orderservice1.repository;


import com.example.orderservice1.entity.Order;
import com.example.orderservice1.service.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
