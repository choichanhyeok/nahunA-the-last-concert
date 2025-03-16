package com.hyeok.ticketing.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    /* 공통 관련 */
    INTERNAL_SERVER_ERROR("SYSTEM_COMMON_001"),
    MESSAGE_NOT_FOUND("SYSTEM_COMMON_002"),

    /* 휴대폰 인증 관련 */
    AUTHENTICATION_FAILED("AUTH_PHONE_001"),
    INVALID_AUTH_CODE("AUTH_PHONE_002"),
    INVALID_AUTH_CODE_EXPIRED("AUTH_PHONE_003"),
    PHONE_NOT_VERIFIED("AUTH_PHONE_004"),
    PHONE_VERIFICATION_FAILED("AUTH_PHONE_005"),

    /* 로그인 관련 */
    INVALID_LOGIN_ID("AUTH_LOGIN_001"),
    INVALID_PASSWORD("AUTH_LOGIN_002"),

    /* 회원가입 관련 */
    INVALID_USER("AUTH_SIGNUP_001"),
    USER_ALREADY_EXISTS("AUTH_SIGNUP_002"),
    PASSWORD_ENCRYPTION_FAILED("AUTH_SIGNUP_003");

    private final String code;

}
