package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_recovery_possibility;

public class PhoneNumberClient {
    PhoneNumber getHeadOfficeNumber() {
        return PhoneNumber.parse("01234typo56789");
    }

    PhoneNumber getUserPhoneNumber(UserInput input) {
        return PhoneNumber.parse(input.getPhoneNumber());
    }
}
