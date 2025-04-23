package org.example.foodDeliverySys.version1.perm;

import org.example.foodDeliverySys.version1.data.User;

public class CheckoutCartPermission implements Permission{
    private final User user;

    public CheckoutCartPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
