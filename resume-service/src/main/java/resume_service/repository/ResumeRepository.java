package resume_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import resume_service.model.Resume;

import java.util.Optional;

public interface ResumeRepository
        extends MongoRepository<Resume, String> {

    Optional<Resume> findByUserEmail(String email);
}