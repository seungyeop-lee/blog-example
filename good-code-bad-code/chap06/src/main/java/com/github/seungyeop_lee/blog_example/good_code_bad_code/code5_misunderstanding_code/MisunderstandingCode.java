package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code.stub.LocalizedMessages;

public class MisunderstandingCode {
    private static class UserDisplay {
        private final LocalizedMessages messages;

        private UserDisplay(LocalizedMessages messages) {
            this.messages = messages;
        }

        void displayLegalDisclaimer(String legalText) {
            if (legalText == null) {
                return;
            }

            displayOverlay(
                    messages.getLegalDisclaimerTitle(),
                    legalText,
                    Color.RED
            );
        }

        private void displayOverlay(String legalDisclaimerTitle, String legalText, Color color) {
            //디스플레이 로직
        }
    }

    private static class SignupFlow {
        private final UserDisplay userDisplay;
        private final LocalizedMessages localizedMessages;

        private SignupFlow(UserDisplay userDisplay, LocalizedMessages localizedMessages) {
            this.userDisplay = userDisplay;
            this.localizedMessages = localizedMessages;
        }

        void ensureLegalCompliance() {
            userDisplay.displayLegalDisclaimer(localizedMessages.getSignupDisclaimer());
        }
    }
}
