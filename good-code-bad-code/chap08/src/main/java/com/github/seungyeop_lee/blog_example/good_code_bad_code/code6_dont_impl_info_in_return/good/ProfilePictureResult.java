package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_dont_impl_info_in_return.good;

import java.util.List;

interface ProfilePictureResult {

    /**
     * 프로필 사진에 대한 요청이 성공인지 여부를 나타낸다.
     */
    Status getStatus();

    /**
     * 프로필 사진이 발견된 경우 그 사진의 이미지 데이터
     */
    List<Byte> getImageData();

    enum Status {
        SUCCESS,
        USER_DOES_NOT_EXIST,
        OTHER_ERROR
    }
}
