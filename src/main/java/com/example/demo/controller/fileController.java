package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class fileController {
    @PostMapping(value = "/{id}/photos")
    public @ResponseBody String fileupload(@RequestParam ("boardfile")MultipartFile file) {
        return "3";
    }
}
