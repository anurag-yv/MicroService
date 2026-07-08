package com.example.order_service.service;


import com.example.order_service.Entity.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Service
//public class OrderService {
//
//    @Autowired
//    private OrderRepository repository;
//    public Order saveOrder(Order order){
//        return repository.save(order);
//    }
//}

@Service
public class OrderService {
    @Autowired
    RestTemplate restTemplate;
    public String placeOrder(String product){
        String paymentStatus=restTemplate.getForObject("http://localhost:8072/payment/"+product,String.class);
       if(paymentStatus.equals("PAYMENT SUCCESS")){
           return "Order placed successfully";
       }
       return "Order failed";
    }
}
