package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_dont_use_magic_value.case1;

import java.util.List;

public class ReturnMagicNumber {
    Double getMeanAge(List<User> users) {
        if (users.isEmpty()) {
            return null;
        }

        Double sumOfAges = 0.0;
        for (User user : users) {
            sumOfAges += (double) user.getAge();
        }
        return sumOfAges / (double) users.size();
    }

    private static class User {
        private final Integer age;

        private User(Integer age) {
            this.age = age;
        }

        int getAge() {
            if (age == null) {
                return -1;
            }
            return age;
        }
    }
}
