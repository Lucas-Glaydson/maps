package com.maps.maps_project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptionMap {
    @ExceptionHandler(MapNotFoundException.class)
    private ResponseEntity<String> mapNotFound(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MapNotFoundException().getMessage());
    }
}
