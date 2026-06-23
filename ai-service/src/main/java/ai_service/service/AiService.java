package ai_service.service;

import org.springframework.stereotype.Service;

@Service
public class AiService {

    public String analyze(String resumeText) {

        return """
                Skill Analysis

                Recommended Skills:
                - Docker
                - Kubernetes
                - AWS

                Career Path:
                Java Backend Developer

                Roadmap:
                Spring Boot → Docker → Kubernetes → AWS
                """;
    }
}