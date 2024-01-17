package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_time_treatment.after;

import java.time.Duration;

class UiSettings {

    /**
     * @param message  보낼 메시지
     * @param deadline 데드라인이 경과하기까지 메시지가 전송
     *                 되지 않으면 전송은 취소된다.
     * @return 메시지가 전송되면 참을, 그렇지 않으면 거짓
     */
    Boolean sendMessage(String message, Duration deadline) {
        // logic
        return true;
    }

    /**
     * @return UI 메시지를 보여주는 기간
     */
    Duration getMessageTimeout() {
        return Duration.ofSeconds(5);
    }

    /**
     * @param message 보여줄 메시지
     * @param timeout 메시지를 보여주는 시간의 양
     */
    void showMessage(String message, Duration timeout) {
        // logic
    }
}
