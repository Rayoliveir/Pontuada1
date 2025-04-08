package com.example.pontuada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {
    @GetMapping
    public String welcome(){
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Marcelly Oliveira";
    }
}
