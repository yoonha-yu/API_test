package org.example.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ArticleModifyRequest {
    @NotBlank
    private String subject;
    @NotBlank
    private String content;
}
