package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_dont_impl_info_in_return.bad;

interface ProfilePictureResult {
    /**
     * 프로필 사진에 대한 요청이 성공인지 여부를 나타낸다.
     */
    HttpResponse.Status getStatus();

    /**
     * 프로필 사진이 발견된 경우 그 사진의 이미지 데이터
     */
    HttpResponse.Payload getImageData();
}
