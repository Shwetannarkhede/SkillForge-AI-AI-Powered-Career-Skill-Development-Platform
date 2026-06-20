package user_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import user_service.model.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);
}