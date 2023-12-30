package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_misunderstanding_code.stub.LocalizedMessages;
import jakarta.annotation.Nonnull;

public class CertainCode {
    private static class UserDisplay {
        private final LocalizedMessages messages;

        private UserDisplay(LocalizedMessages messages) {
            this.messages = messages;
        }

        void displayLegalDisclaimer(@Nonnull String legalText) {
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

        boolean ensureLegalCompliance() {
            String signupDisclaimer = localizedMessages.getSignupDisclaimer();
            if (signupDisclaimer == null) {
                return false;
            }
            userDisplay.displayLegalDisclaimer(signupDisclaimer);
            return true;
        }
    }
}
