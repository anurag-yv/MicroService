package com.example.inventory_service.service;


import com.example.inventory_service.Entity.Product;
import com.example.inventory_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;
    public String checkStock(String productName){
        Optional<Product>product=repo.findByProductName(productName);
        if(product.isPresent() && product.get().getQuantity()>0){
            return "AVAILABLE";
        }
        return "NOT AVAILABLE";
    }
}
