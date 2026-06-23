package resume_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import resume_service.dto.ResumeAnalysisRequest;

@FeignClient(name = "AI-SERVICE")
public interface AiClient {

    @PostMapping("/ai/analyze")
    String analyzeResume(
            @RequestBody ResumeAnalysisRequest request);
}