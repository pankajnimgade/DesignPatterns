package three.source.test.commands;

import three.source.test.vendor.classes.GarageDoor;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class GarageDoorLightOffCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.lightOff();
    }

    public void undo() {
        garageDoor.lightOn();
    }
}
