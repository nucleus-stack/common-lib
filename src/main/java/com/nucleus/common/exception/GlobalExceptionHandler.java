// package com.nucleus.common.exception;

// import com.nucleus.common.dto.ApiResponse;
// import org.springframework.web.bind.MethodArgumentNotValidException;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RestControllerAdvice;
// import org.springframework.web.bind.annotation.ResponseStatus;
// import com.nucleus.common.exception.AppException;
// import com.nucleus.common.exception.UnauthorizedException;
// import org.springframework.web.bind.annotation.RestControllerAdvice;
// import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;


// @RestControllerAdvice
// public class GlobalExceptionHandler {

//     @ExceptionHandler(AppException.class)
//     public ResponseEntity<ApiResponse<String>> handleAppException(AppException ex) {
//         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
//                 ApiResponse.<String>builder()
//                         .success(false)
//                         .message(ex.getMessage())
//                         .build()
//         );
//     }

//     @ExceptionHandler(UnauthorizedException.class)
//     public ResponseEntity<ApiResponse<String>> handleUnauthorizedException(UnauthorizedException ex) {
//         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(
//                 ApiResponse.<String>builder()
//                         .success(false)
//                         .message(ex.getMessage())
//                         .build()
//         );
//     }

//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<ApiResponse<String>> handleValidationException(MethodArgumentNotValidException ex) {
//         String errorMessage = ex.getBindingResult().getFieldErrors().stream()
//                 .map(error -> error.getField() + ": " + error.getDefaultMessage())
//                 .findFirst()
//                 .orElse("Validation failed");

//         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
//                 ApiResponse.<String>builder()
//                         .success(false)
//                         .message(errorMessage)
//                         .build()
//         );
//     }

//     @ExceptionHandler(Exception.class)
//     public ResponseEntity<ApiResponse<String>> handleGenericException(Exception ex) {
//         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
//                 ApiResponse.<String>builder()
//                         .success(false)
//                         .message("An unexpected error occurred: " + ex.getMessage())
//                         .build()
//         );
//     }
// }
