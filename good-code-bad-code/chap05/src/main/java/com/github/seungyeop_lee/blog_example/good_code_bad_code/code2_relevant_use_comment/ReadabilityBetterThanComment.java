package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_relevant_use_comment;

public class ReadabilityBetterThanComment {

    private static class LogicWithComment {
        String generateId(String[] data) {
            // data[0]는 유저의 이름이고 data[1]은 성이다.
            // "{이름}.{성}"의 형태로 ID를 생성한다.
            return data[0] + "." + data[1];
        }
    }

    private static class ReadabilityLogic {
        String generateId(String[] data) {
            return firstName(data) + "." + lastName(data);
        }

        private String firstName(String[] data) {
            return data[0];
        }

        private String lastName(String[] data) {
            return data[1];
        }
    }
}
