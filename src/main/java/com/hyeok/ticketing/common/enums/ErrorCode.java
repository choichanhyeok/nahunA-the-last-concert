package com.hyeok.ticketing.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    /* 공통 관련 */
    INTERNAL_SERVER_ERROR("SYSTEM_COMMON_001", "서버 내부 오류가 발생했습니다."),
    MESSAGE_NOT_FOUND("SYSTEM_COMMON_002", "메시지를 찾을 수 없습니다."),

    /* 휴대폰 인증 관련 */
    AUTHENTICATION_FAILED("AUTH_PHONE_001", "인증에 실패했습니다."),
    INVALID_AUTH_CODE("AUTH_PHONE_002", "인증 코드가 올바르지 않습니다."),
    INVALID_AUTH_CODE_EXPIRED("AUTH_PHONE_003", "인증 코드가 만료되었습니다."),
    PHONE_NOT_VERIFIED("AUTH_PHONE_004", "휴대폰 인증이 완료되지 않았습니다."),
    PHONE_VERIFICATION_FAILED("AUTH_PHONE_005", "휴대폰 인증에 실패했습니다."),

    /* 로그인 관련 */
    INVALID_LOGIN_ID("AUTH_LOGIN_001", "존재하지 않는 로그인 아이디입니다."),
    INVALID_PASSWORD("AUTH_LOGIN_002", "비밀번호가 올바르지 않습니다."),

    /* 회원가입 관련 */
    INVALID_USER("AUTH_SIGNUP_001", "잘못된 사용자 요청입니다."),
    USER_ALREADY_EXISTS("AUTH_SIGNUP_002", "이미 존재하는 회원입니다."),
    PASSWORD_ENCRYPTION_FAILED("AUTH_SIGNUP_003", "비밀번호 암호화에 실패했습니다.");

    private final String code;
    private final String message;

}
