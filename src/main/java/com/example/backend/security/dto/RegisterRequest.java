package com.example.backend.security.dto;

public record RegisterRequest(
        String username,
        String email,
        String password
) {
}
