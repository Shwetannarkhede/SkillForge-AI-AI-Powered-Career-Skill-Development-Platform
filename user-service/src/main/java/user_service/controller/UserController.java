package user_service.controller;

import org.springframework.web.bind.annotation.*;
import user_service.model.User;
import user_service.service.UserService;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("/profile")
    public String profile() {
        return "Welcome Shweta to SkillForge AI";
    }
}