package com.hyeok.ticketing.common.exception.handler;


import com.hyeok.ticketing.common.dto.ApiResponse;
import com.hyeok.ticketing.common.enums.ErrorCode;
import com.hyeok.ticketing.common.exception.ApplicationException;
import com.hyeok.ticketing.common.util.MessageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ApiResponse<Void>> handleApplicationException(ApplicationException ex) {
        String message = MessageUtil.getMessage(ex.getErrorCode().getCode());
        log.error("애플리케이션 예외 발생: [{}] {}", ex.getErrorCode().getCode(), message);
        ApiResponse<Void> response = ApiResponse.fail(message);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleGenericException(Exception ex) {
        log.error("핸들링되지 않은 익셉션 발생: {}", ex.getMessage());
        String message = MessageUtil.getMessage(ErrorCode.INTERNAL_SERVER_ERROR.getCode());
        return ResponseEntity.internalServerError().body(ApiResponse.fail(message));
    }
}
