package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.many_responsibility;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.*;

public class After {
    private static final Address SCRAPYARD_ADDRESS = null;
    private static final Address SHOWROOM_ADDRESS = null;

    SentConfirmation sendOwnerALetter(Vehicle vehicle, Letter letter) {
        Address ownersAddress = getOwnersAddress(vehicle);
        if (ownersAddress != null) {
            return sendLetter(ownersAddress, letter);
        }
        return null;
    }

    private static Address getOwnersAddress(Vehicle vehicle) {
        if (vehicle.hasBeenScraped()) {
            return SCRAPYARD_ADDRESS;
        }

        Purchase mostRecentPurchase = vehicle.getMostRecentPurchase();
        if (mostRecentPurchase == null) {
            return SHOWROOM_ADDRESS;
        }

        Buyer buyer = mostRecentPurchase.getBuyer();
        if (buyer == null) {
            return null;
        }

        return buyer.getAddress();
    }

    private SentConfirmation sendLetter(Address ownersAddress, Letter letter) {
        return null;
    }
}
