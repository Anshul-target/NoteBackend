package com.example.note_taking_app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoteRequestDTO {

   @NotBlank(message = "Title is Required")
private String title;
   @NotBlank(message = "UserId is Required")
   private String userId;
   @NotBlank(message = "Content is required")
private String content;

}
