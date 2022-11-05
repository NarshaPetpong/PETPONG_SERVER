package com.example.demo.controller;

import com.example.demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boardController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/board")
    public String board (){
        return "board";
    }

}
