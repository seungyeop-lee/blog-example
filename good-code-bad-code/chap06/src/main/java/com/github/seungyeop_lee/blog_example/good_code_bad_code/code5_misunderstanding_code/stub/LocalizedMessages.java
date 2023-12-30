package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code.stub;

import jakarta.annotation.Nullable;

public interface LocalizedMessages {
    String getLegalDisclaimerTitle();

    /**
     * 사용자의 언어가 아닌 기본 설정 언어로 된 텍스트를 제공하는 것은 적법한
     * 것이 아닐 수도 있기 때문에 사용자의 언어로 된 번역 텍스트가 존재하지
     * 않는다면 널을 반환한다.
     */
    @Nullable
    String getSignupDisclaimer();
}
