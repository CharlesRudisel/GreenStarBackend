package com.example.backend.security.dto;


//@Builder
public record RegisterRequest(
        String username,
        String email,
        String password
) {


}
