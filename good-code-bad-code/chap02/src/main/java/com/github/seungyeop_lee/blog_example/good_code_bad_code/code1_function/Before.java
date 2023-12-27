package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_function;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_function.stub.*;

public abstract class Before {
    private static final Address SCRAPYARD_ADDRESS = new Address();
    private static final Address SHOWROOM_ADDRESS = new Address();

    public SentConfirmation sendOwnerALetter(Vehicle vehicle, Letter letter) {
        Address ownersAddress;
        if (vehicle.hasBeenScraped()) {
            ownersAddress = SCRAPYARD_ADDRESS;
        } else {
            Purchase mostRecentPurchase = vehicle.getMostRecentPurchase();
            if (mostRecentPurchase == null) {
                ownersAddress = SHOWROOM_ADDRESS;
            } else {
                ownersAddress = mostRecentPurchase.getBuyersAddress();
            }
        }

        if (ownersAddress == null) {
            return null;
        }

        return sendLetter(ownersAddress, letter);
    }

    abstract SentConfirmation sendLetter(Address ownersAddress, Letter letter);
}
