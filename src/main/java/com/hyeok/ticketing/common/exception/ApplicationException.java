package com.hyeok.ticketing.common.exception;

import com.hyeok.ticketing.common.enums.ErrorCode;
import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

    private final ErrorCode errorCode;

    public ApplicationException(ErrorCode errorCode) {
        super(errorCode.getCode());
        this.errorCode = errorCode;
    }

    public ApplicationException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getCode(), cause);
        this.errorCode = errorCode;
    }
}
