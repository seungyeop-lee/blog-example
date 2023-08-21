package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response;

import lombok.Getter;

@Getter
public abstract class BaseApiResponse {
    protected String resultCode;
    protected String resultMessage;

    public void markOk() {
        this.resultCode = "0000";
        this.resultMessage = "정상 처리 되었습니다.";
    }
}
