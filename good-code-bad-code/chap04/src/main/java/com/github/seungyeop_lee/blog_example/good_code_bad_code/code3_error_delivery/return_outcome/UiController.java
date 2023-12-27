package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.return_outcome;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.return_outcome.stub.Channel;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    void sayHello(Channel channel) {
        if (sendMessage(channel, "hello")) {
            ui.setOutput("Hello sent");
        } else {
            ui.setError("Unable to send hello");
        }
    }

    @CheckReturnValue
    Boolean sendMessage(Channel channel, String message) {
        if (channel.isOpen()) {
            channel.send(message);
            return true;
        }
        return false;
    }
}
