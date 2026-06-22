package resume_service.dto;

import lombok.Data;

@Data
public class ResumeRequest {

    private String userEmail;

    private String resumeText;
}