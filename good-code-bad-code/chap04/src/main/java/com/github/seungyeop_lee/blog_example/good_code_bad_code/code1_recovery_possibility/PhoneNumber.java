package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_recovery_possibility;

public class PhoneNumber {

    static PhoneNumber parse(String number) {
        if (!isValidPhoneNumber(number)) {
            // 에러를 처리하기 위한 코드
        }

        // 로직
        return null;
    }

    private static boolean isValidPhoneNumber(String number) {
        return false;
    }
}
