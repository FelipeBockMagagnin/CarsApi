package com.ifrs.carrocaro.CarroCaro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public ResponseEntity<String> index()
    {
        return ResponseEntity.ok("Desculpa por ser homem!");
    }
}