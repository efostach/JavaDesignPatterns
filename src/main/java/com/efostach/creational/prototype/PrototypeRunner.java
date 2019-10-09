package com.efostach.creational.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        CloudConfiguration config = new CloudConfiguration(1, "KVM", "KVM, PaaS, 9Gb");
        System.out.println(config);

        CloudConfigurationFactory factory = new CloudConfigurationFactory(config);
        CloudConfiguration copyConfig = factory.cloneConfig();
        System.out.println(copyConfig);
    }
}
