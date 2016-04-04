package one.source.test.command;

import one.source.test.vendor.classes.GarageDoor;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
