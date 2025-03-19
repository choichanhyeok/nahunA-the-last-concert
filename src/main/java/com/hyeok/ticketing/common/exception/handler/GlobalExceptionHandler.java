package com.hyeok.ticketing.common.exception.handler;


import com.hyeok.ticketing.common.dto.ApiResponse;
import com.hyeok.ticketing.common.enums.ErrorCode;
import com.hyeok.ticketing.common.exception.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ApiResponse<Void>> handleApplicationException(ApplicationException ex) {

        String code = ex.getErrorCode().getCode();
        String message = ex.getErrorCode().getMessage();

        log.error("애플리케이션 예외 발생: [{}] {}", code, message);
      
        ApiResponse<Void> response = ApiResponse.fail(message);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleGenericException(Exception ex) {
        log.error("핸들링되지 않은 익셉션 발생: {}", ex.getMessage());

        ErrorCode errorCode = ErrorCode.INTERNAL_SERVER_ERROR;
        return ResponseEntity.internalServerError()
                .body(ApiResponse.fail(errorCode.getMessage()));
    }

}
