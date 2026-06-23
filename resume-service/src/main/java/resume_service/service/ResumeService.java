package resume_service.service;

import org.springframework.stereotype.Service;
import resume_service.client.AiClient;
import resume_service.dto.ResumeAnalysisRequest;
import resume_service.dto.ResumeRequest;
import resume_service.model.Resume;
import resume_service.repository.ResumeRepository;

import java.util.List;

@Service
public class ResumeService {

    private final ResumeRepository repository;
    private final AiClient aiClient;

    public ResumeService(ResumeRepository repository , AiClient aiClient) {
        this.repository = repository;
        this.aiClient = aiClient ;
    }

    public Resume uploadResume(ResumeRequest request) {

        Resume resume = new Resume();

        resume.setUserEmail(request.getUserEmail());
        resume.setResumeText(request.getResumeText());

        ResumeAnalysisRequest analysisRequest = new ResumeAnalysisRequest();

        analysisRequest.setResumeText(request.getResumeText()
        );

        String analysis =
                aiClient.analyzeResume(analysisRequest);

        resume.setAiAnalysis(analysis);

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