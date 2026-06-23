package ai_service.controller;

import ai_service.dto.ResumeAnalysisRequest;
import ai_service.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final AiService service;

    public AiController(AiService service) {
        this.service = service;
    }

    @PostMapping("/analyze")
    public String analyze(
            @RequestBody ResumeAnalysisRequest request) {

        return service.analyze(request.getResumeText());
    }
}