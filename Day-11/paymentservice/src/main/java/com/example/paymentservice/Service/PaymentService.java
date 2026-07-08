package com.example.paymentservice.Service;


import com.example.paymentservice.Entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PaymentService {
    @Autowired
    private PaymentRepository repository;
    public Payment savePayment(Payment payment) {
        return repository.save(payment);
    }
    public List<Payment> getAllPayments() {
        return repository.findAll();
    }
    public Payment getPaymentById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
