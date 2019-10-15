package com.efostach.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AppUser implements User {
    private List<ServiceProvider> serviceProviders;

    public AppUser() {
        serviceProviders = new ArrayList<>();
    }

    void addService(ServiceProvider sp) {
        serviceProviders.add(sp);
    }

    @Override
    public void getAccess(String status, ServiceProvider sp) {
        for (ServiceProvider service : serviceProviders) {
            if(service == sp) {
                service.receive(status);
            }
        }
    }
}