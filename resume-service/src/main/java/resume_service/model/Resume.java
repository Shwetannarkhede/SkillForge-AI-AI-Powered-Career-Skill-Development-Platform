package resume_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "resumes")
public class Resume {

    @Id
    private String id;

    private String userEmail;

    private String resumeText;

    private List<String> skills;

    private String careerSuggestion;
}