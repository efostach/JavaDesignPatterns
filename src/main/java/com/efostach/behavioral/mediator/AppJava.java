package com.efostach.behavioral.mediator;

public class AppJava {
    public static void main(String[] args) {
        AppUser user = new AppUser();

        ServiceProvider fb = new FacebookService(user);
        ServiceProvider gl = new GoogleService(user);

        user.addService(fb);
        user.addService(gl);

        fb.receive("https://facebook.com/user");
        gl.receive("https://google.com/user");

        user.getAccess("Sensitive data for getting an access to FB.", fb);

    }
}
