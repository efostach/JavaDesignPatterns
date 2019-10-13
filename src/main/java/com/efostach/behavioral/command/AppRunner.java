package com.efostach.behavioral.command;

public class AppRunner {
    public static void main(String[] args) {
        ResourceOrchestrator resourceOrchestrator = new ResourceOrchestrator();

        Resource resource = new Resource(new CreateCommand(resourceOrchestrator),
                new UpdateCommand(resourceOrchestrator),
                new DeleteCommand(resourceOrchestrator));

        resource.createRecord();
        resource.updateRecord();
        resource.deleteRecord();

    }
}
