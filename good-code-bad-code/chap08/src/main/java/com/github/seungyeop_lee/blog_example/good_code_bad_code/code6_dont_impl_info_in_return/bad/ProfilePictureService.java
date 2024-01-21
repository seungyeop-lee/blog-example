package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_dont_impl_info_in_return.bad;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_dont_impl_info_in_return.common_stub.HttpFetcher;

class ProfilePictureService {

    private final HttpFetcher httpFetcher;

    public ProfilePictureService(HttpFetcher httpFetcher) {
        this.httpFetcher = httpFetcher;
    }

    ProfilePictureResult getProfilePicture(Integer userId) {
        return null;
    }
}
