package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_dont_use_magic_value.case1;

import java.util.List;

public class ReturnNull {
    Double getMeanAge(List<User> users) {
        if (users.isEmpty()) {
            return null;
        }

        Double sumOfAges = 0.0;
        for (User user : users) {
            sumOfAges += user.getAge() != null ? user.getAge().doubleValue() : 0.0;
        }
        return sumOfAges / (double) users.size();
    }

    private static class User {
        private final Integer age;

        private User(Integer age) {
            this.age = age;
        }

        Integer getAge() {
            return age;
        }
    }
}
