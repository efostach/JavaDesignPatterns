package com.efostach.structural.decorator;

public class PrivateCloud implements Cloud {

    @Override
    public String createCloud() {
        return "Private Cloud creation";
    }
}
