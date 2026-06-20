package user_service.service;

import org.springframework.stereotype.Service;
import user_service.model.User;
import user_service.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}