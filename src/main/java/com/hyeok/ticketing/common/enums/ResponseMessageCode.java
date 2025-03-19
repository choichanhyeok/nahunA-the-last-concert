package com.hyeok.ticketing.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseMessageCode {

    /* 인증: 휴대폰 인증 */
    AUTH_SIGNUP_VERIFY_PHONE_REQUEST("AUTH_SIGNUP_001", "휴대폰 인증 번호 요청이 완료되었습니다."),
    AUTH_SIGNUP_VERIFY_PHONE_SUCCESS("AUTH_SIGNUP_002", "휴대폰 인증이 완료되었습니다."),

    /* 인증: 회원가입 */
    AUTH_SIGNUP_SUCCESS("AUTH_SIGNUP_003", "회원가입이 완료되었습니다."),

    /* 인증: 로그인 */
    AUTH_LOGIN_SUCCESS("AUTH_LOGIN_001", "로그인이 성공적으로 완료되었습니다.");

    private final String code;
    private final String message;

}
