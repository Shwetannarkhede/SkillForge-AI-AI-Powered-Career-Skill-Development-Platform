package user_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import user_service.model.User;

public interface UserRepository
        extends MongoRepository<User, String> {

}