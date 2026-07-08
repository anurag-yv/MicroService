package com.example.paymentservice.Service;//package com.example.paymentservice.Service;
//
//
//import com.example.paymentservice.Entity.Payment;
//import com.example.paymentservice.repository.PaymentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//
//public class PaymentService {
//    @Autowired
//    private PaymentRepository repository;
//    public Payment savePayment(Payment payment) {
//        return repository.save(payment);
//    }
//    public List<Payment> getAllPayments() {
//        return repository.findAll();
//    }
//    public Payment getPaymentById(Long id) {
//        return repository.findById(id).orElse(null);
//    }
//
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
    @Autowired
    RestTemplate restTemplate;
    public String processPayment(String product){
        String stockStatus =restTemplate.getForObject("http://localhost:8071/inventory/check/"+product,String.class);
        if(stockStatus.equals("AVAILABLE")){
            return "PAYMENT SUCCESS";
        }
        return "PAYMENT FAILED: Product Out Of Stock";
    }
}
