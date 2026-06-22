package resume_service.service;

import org.springframework.stereotype.Service;
import resume_service.dto.ResumeRequest;
import resume_service.model.Resume;
import resume_service.repository.ResumeRepository;

import java.util.List;

@Service
public class ResumeService {

    private final ResumeRepository repository;

    public ResumeService(ResumeRepository repository) {
        this.repository = repository;
    }

    public Resume uploadResume(ResumeRequest request) {

        Resume resume = new Resume();

        resume.setUserEmail(request.getUserEmail());
        resume.setResumeText(request.getResumeText());

        return repository.save(resume);
    }

    public List<Resume> getAllResumes() {
        return repository.findAll();
    }

    public Resume getResumeByEmail(String email) {

        return repository.findByUserEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("Resume not found"));
    }
}