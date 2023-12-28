package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.many_responsibility;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.*;

public class Before {
    private static final Address SCRAPYARD_ADDRESS = null;
    private static final Address SHOWROOM_ADDRESS = null;

    SentConfirmation sendOwnerALetter(Vehicle vehicle, Letter letter) {
        Address ownersAddress = null;
        if (vehicle.hasBeenScraped()) {
            ownersAddress = SCRAPYARD_ADDRESS;
        } else {
            Purchase mostRecentPurchase = vehicle.getMostRecentPurchase();
            if (mostRecentPurchase == null) {
                ownersAddress = SHOWROOM_ADDRESS;
            } else {
                Buyer buyer = mostRecentPurchase.getBuyer();
                if (buyer != null) {
                    ownersAddress = buyer.getAddress();
                }
            }
        }

        if (ownersAddress == null) {
            return null;
        }

        return sendLetter(ownersAddress, letter);
    }

    private SentConfirmation sendLetter(Address ownersAddress, Letter letter) {
        return null;
    }
}
