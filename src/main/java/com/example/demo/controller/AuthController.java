package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.model.ApiResponse;
import com.example.demo.model.LoginRequest;
import com.example.demo.model.SignupRequest;
import com.example.demo.model.UserResponse;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest request) {
        User user = authService.signup(request);

        UserResponse response = new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getPhone()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse<>("User registered successfully",response));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
//        User user = authService.login(request);
            String token = authService.login(request);
//        UserResponse response = new UserResponse(
//                user.getId(),
//                user.getUsername(),
//                user.getPhone()
//        );
        return  ResponseEntity.ok(Map.of( "message", "Login successful",
                "token", token));
//        return ResponseEntity.ok(new ApiResponse<>("Login successful",response));
    }
}
