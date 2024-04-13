package com.example.testApp.controllers;

import com.example.testApp.dto.AuthenticateRequest;
import com.example.testApp.dto.AuthenticationResponse;
import com.example.testApp.service.AuthenticationService;
import com.example.testApp.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(authenticationService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticateRequest request){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
