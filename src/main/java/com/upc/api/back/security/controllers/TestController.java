package com.upc.api.back.security.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization")
@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndpoint() {
        return "This is the admin endpoint, accessible only to users with ADMIN role.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('USER')")
    public String userEndpoint() {
        return "This is the user endpoint, accessible to users with USER or ADMIN role.";
    }
}

