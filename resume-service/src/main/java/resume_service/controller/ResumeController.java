package resume_service.controller;

import org.springframework.web.bind.annotation.*;
import resume_service.dto.ResumeRequest;
import resume_service.model.Resume;
import resume_service.service.ResumeService;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ResumeService service;

    public ResumeController(ResumeService service) {
        this.service = service;
    }

    @PostMapping("/upload")
    public Resume uploadResume(
            @RequestBody ResumeRequest request) {

        return service.uploadResume(request);
    }

    @GetMapping
    public List<Resume> getAllResumes() {
        return service.getAllResumes();
    }

    @GetMapping("/{email}")
    public Resume getResumeByEmail(
            @PathVariable String email) {

        return service.getResumeByEmail(email);
    }
}