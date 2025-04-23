package org.example.foodDeliverySys.version1.perm;

import org.example.foodDeliverySys.version1.data.User;

public class PlaceOrderPermission implements Permission{
    private final User user;

    public PlaceOrderPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
