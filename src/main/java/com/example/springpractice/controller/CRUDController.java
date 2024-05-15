package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @GetMapping(value="/get")
    public String getName(){
        return "Get";
    }
}
