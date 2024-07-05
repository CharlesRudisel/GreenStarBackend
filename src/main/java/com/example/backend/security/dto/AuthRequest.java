package com.example.backend.security.dto;

//@Builder
public record AuthRequest(
        String username,
        String password

) {

}
