package com.Pavan.demo.StudentServer.execptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    public ResponseEntity<String> handleRuntimeExeption(RuntimeException e) {
        return ResponseEntity.status(500)
                .body(e.getMessage());
    }

}
