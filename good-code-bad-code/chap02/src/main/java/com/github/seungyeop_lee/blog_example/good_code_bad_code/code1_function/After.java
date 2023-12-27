package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_function;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_function.stub.*;

public abstract class After {
    private static final Address SCRAPYARD_ADDRESS = new Address();
    private static final Address SHOWROOM_ADDRESS = new Address();

    SentConfirmation sendOwnerALetter(Vehicle vehicle, Letter letter) {
        Address ownersAddress = getOwnersAddress(vehicle);
        if (ownersAddress == null) {
            return null;
        }
        return sendLetter(ownersAddress, letter);
    }

    private Address getOwnersAddress(Vehicle vehicle) {
        if (vehicle.hasBeenScraped()) {
            return SCRAPYARD_ADDRESS;
        }

        Purchase mostRecentPurchase = vehicle.getMostRecentPurchase();
        if (mostRecentPurchase == null) {
            return SHOWROOM_ADDRESS;
        }

        return mostRecentPurchase.getBuyersAddress();
    }

    abstract SentConfirmation sendLetter(Address ownersAddress, Letter letter);
}
