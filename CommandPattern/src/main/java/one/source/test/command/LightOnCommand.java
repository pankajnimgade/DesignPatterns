package one.source.test.command;

import one.source.test.vendor.classes.Light;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
