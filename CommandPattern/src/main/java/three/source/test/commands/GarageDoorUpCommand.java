package three.source.test.commands;

import three.source.test.vendor.classes.GarageDoor;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
