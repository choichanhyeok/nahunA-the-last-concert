package com.hyeok.ticketing.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseMessageCode {

    /* 인증: 휴대폰 인증 */
    AUTH_SIGNUP_VERIFY_PHONE_REQUEST("AUTH_SIGNUP_001"),
    AUTH_SIGNUP_VERIFY_PHONE_SUCCESS("AUTH_SIGNUP_002"),

    /* 인증: 회원가입 */
    AUTH_SIGNUP_SUCCESS("AUTH_SIGNUP_001"),

    /* 인증: 로그인 */
    AUTH_LOGIN_SUCCESS("AUTH_LOGIN_001");

    private final String code;

}
