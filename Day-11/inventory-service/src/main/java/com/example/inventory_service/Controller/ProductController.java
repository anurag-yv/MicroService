package com.example.inventory_service.Controller;


import com.example.inventory_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class ProductController {
    @Autowired
    public ProductService service;

    @GetMapping("/check/{name}")
    public String checkStock(@PathVariable String name){
        return service.checkStock(name);
    }
}
