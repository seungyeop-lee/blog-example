package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_relevant_use_comment;

public class DuplicatedComment {
    String generateId(String firstName, String lastName) {
        // "{이름}.{성}"의 형태로 ID를 생성한다.
        return firstName + "." + lastName;
    }
}
