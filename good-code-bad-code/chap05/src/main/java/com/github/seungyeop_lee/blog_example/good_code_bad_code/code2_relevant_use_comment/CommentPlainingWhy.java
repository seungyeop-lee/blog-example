package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_relevant_use_comment;

public class CommentPlainingWhy {
    private static class User {
        private final String username;
        private final String firstName;
        private final String lastName;
        private final Version signupVersion;

        private User(String username, String firstName, String lastName, Version signupVersion) {
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.signupVersion = signupVersion;
        }

        String getUserId() {
            if (signupVersion.isOlderThan("2.0")) {
                // (v2.0 이전에 등록한) 레거시 유저는 이름을 ID가 부여된다.
                // 자세한 내용은 #4218 이슈를 보라.
                return firstName.toLowerCase() + "." + lastName.toLowerCase();
            }

            // (v2.0 이후로 등록한) 새 유저는 username으로 ID가 부여된다.
            return username;
        }
    }

    private static class Version {
        public boolean isOlderThan(String s) {
            return false;
        }
    }
}
