package one.source.test;

import one.source.test.command.GarageDoorOpenCommand;
import one.source.test.command.LightOnCommand;
import one.source.test.vendor.classes.GarageDoor;
import one.source.test.vendor.classes.Light;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class RemoteControlTest {

    public static void main(String[] args){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenComand = new GarageDoorOpenCommand(garageDoor);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setSlot(garageDoorOpenComand);
        simpleRemoteControl.buttonWasPressed();
    }
}
