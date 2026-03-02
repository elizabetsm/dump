package ru.lizka.pipiska.controller;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> globalEx(Exception e) {
        return ResponseEntity.status(500)
                .body(ErrorResponse.builder()
                        .status(500)
                        .errorMessage("Upsik... Some error")
                        .error(e.getMessage())
                        .build());
    }

    @Builder
    public static class ErrorResponse {
        int status;
        String errorMessage;
        String error;
    }
}
