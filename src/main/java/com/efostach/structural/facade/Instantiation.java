package com.efostach.structural.facade;

public class Instantiation {

    void run() {

        Cloud cloud = new Cloud("Amazon", 1);
        CloudOrder order = new CloudOrder();
        CloudConfiguration config = new CloudConfiguration("Ansible script");

        order.startOrderExecution();
        config.aploadConfig(cloud);
        order.completeOrderExecution();
    }

}
