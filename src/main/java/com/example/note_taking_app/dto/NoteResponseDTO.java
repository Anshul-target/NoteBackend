package com.example.note_taking_app.dto;

import com.example.note_taking_app.model.NoteModel;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class NoteResponseDTO {

private  String id;
private String title;
private String content;
private Instant createdAt;
private Instant updatedAt;
private String userId;

public static NoteResponseDTO toNoteResponseDTO(NoteModel note){
    return NoteResponseDTO.builder()
            .content(note.getContent())
            .title(note.getTitle())
            .createdAt(note.getCreatedAt())
            .updatedAt(note.getUpdatedAt())
            .userId(note.getUserId())
            .build();
}
}
