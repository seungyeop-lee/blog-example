package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_time_treatment.before;

class UiSettings {

    /**
     * @param message  보낼 메시지
     * @param deadline 데드라인은 초 단위다.
     *                 데드라인이 경과하기까지 메시지가 전송
     *                 되지 않으면 전송은 취소된다.
     * @return 메시지가 전송되면 참을 그렇지 않으면 거짓
     */
    Boolean sendMessage(String message, Long deadline) {
        // logic
        return true;
    }

    /**
     * @return UI 메시지를 보여주는 초 단위 기간
     */
    Long getMessageTimeout() {
        return 5L;
    }

    /**
     * @param message   보여줄 메시지
     * @param timeoutMs 메시지를 보여주는 밀리초 단위의 기간
     */
    void showMessage(String message, Long timeoutMs) {
        // logic
    }
}
