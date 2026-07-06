package com.example.securityydemo.Controller;

import com.example.securityydemo.Entity.Users;
import com.example.securityydemo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "welcome to public page";
    }

    @GetMapping("/user")
    public String userPage() {
        return "welcome user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "welcome admin";
    }

    @PostMapping("/save")
    public Users saveUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}