package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.nested_if;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.Purchase;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.Vehicle;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.Address;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_avoid_nest.stub.Buyer;

public class After {
    private static final Address SCRAPYARD_ADDRESS = null;
    private static final Address SHOWROOM_ADDRESS = null;

    Address getOwnersAddress(Vehicle vehicle) {
        if (vehicle.hasBeenScraped()) {
            return SCRAPYARD_ADDRESS;
        }

        Purchase mostRecentPurchase = vehicle.getMostRecentPurchase();
        if (mostRecentPurchase == null) {
            return SHOWROOM_ADDRESS;
        }

        Buyer buyer = mostRecentPurchase.getBuyer();
        if (buyer != null) {
            return buyer.getAddress();
        }

        return null;
    }
}
