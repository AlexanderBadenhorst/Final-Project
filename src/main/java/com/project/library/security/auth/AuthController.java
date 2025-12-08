package com.project.library.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return "OK - stub";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return "OK - stub";
    }
}
