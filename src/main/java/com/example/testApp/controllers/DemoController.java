package com.example.testApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("kimlik doğrulaması gereken sayfaya hoş geldiniz.");
    }
}
