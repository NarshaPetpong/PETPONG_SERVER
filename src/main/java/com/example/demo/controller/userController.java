package com.example.demo.controller;

import com.example.demo.Entity.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    private final com.example.demo.Repository.userRepository userRepository;

    public userController(com.example.demo.Repository.userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
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
        return (List<UserEntity>) userRepository.findAll();
    }


}
