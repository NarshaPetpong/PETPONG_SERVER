package com.example.demo.controller;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private final UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    private String Login(@RequestBody UserEntity user) {
        userRepository.save(user);
        System.out.println("Login 작동");
        return "signUp";

    }


    @PostMapping("/signup")
    public UserEntity signup(@RequestBody UserEntity user) {
        System.out.println(">>"+user.toString());
        userRepository.save(user);
        System.out.println("signUp 작동");
        return user;
    }

    @GetMapping( "/users")
    public @ResponseBody List<UserEntity> GetUser() {
        return userRepository.findAll();
    }


}
