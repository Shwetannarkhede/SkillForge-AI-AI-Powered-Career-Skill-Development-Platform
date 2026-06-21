package user_service.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import user_service.dto.RegisterRequest;
import user_service.model.User;
import user_service.service.UserService;
import user_service.dto.LoginRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@Valid @RequestBody RegisterRequest request) {
        return service.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        return service.login(
                request.getEmail(),
                request.getPassword()
        );
    }
}