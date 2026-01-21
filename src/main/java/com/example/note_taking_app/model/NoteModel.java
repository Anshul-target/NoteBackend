package com.example.note_taking_app.model;


import com.example.note_taking_app.dto.NoteRequestDTO;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@Document(collection = "note_entity")
public class NoteModel {
    @Id
    String id;
    String title;
    String userId;
 String content;
 Instant createdAt;
 Instant updatedAt;

 public static NoteModel ToEntity(NoteRequestDTO noteRequest){
     return NoteModel.builder()
             .content(noteRequest.getContent())
             .userId(noteRequest.getUserId())
             .title(noteRequest.getTitle())
             .build();
 }
}
