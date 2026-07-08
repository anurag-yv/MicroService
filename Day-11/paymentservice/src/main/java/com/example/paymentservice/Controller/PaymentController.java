package com.example.paymentservice.Controller;

//import com.example.paymentservice.Entity.Payment;
//import com.example.paymentservice.Service.PaymentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/payments")
//public class PaymentController {
//    @Autowired
//    private PaymentService service;
//    @PostMapping
//    public Payment savePayment(@RequestBody Payment payment) {
//        return service.savePayment(payment);
//    }
//    @GetMapping("/{id}")
//    public Payment getPayment(@PathVariable Long id) {
//        return service.getPaymentById(id);
//    }
//
//
//}

import com.example.paymentservice.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService service;
    @GetMapping("/{product}")
    public String pay(@PathVariable String product){
        return service.processPayment(product);
    }
}