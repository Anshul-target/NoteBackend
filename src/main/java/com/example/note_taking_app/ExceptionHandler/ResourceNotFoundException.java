package com.example.note_taking_app.ExceptionHandler;


public class ResourceNotFoundException extends RuntimeException {
   public ResourceNotFoundException(String msg){
        super(msg);
    }
}
