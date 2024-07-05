package com.example.backend.security.dto;

public record AuthRequest(
        String username,
        String password
) {
}
