package three.source.test;

import three.source.test.commands.CeilingLightOffCommand;
import three.source.test.commands.CeilingLightOnCommand;
import three.source.test.vendor.classes.CeilingLight;

/**
 * Created by Pankaj Nimgade on 07-04-2016.
 */
public class TestDriveTwo {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        System.out.println(remoteControl.toString());

        CeilingLightOnCommand ceilingLightOnCommand = new CeilingLightOnCommand(new CeilingLight());
        CeilingLightOffCommand ceilingLightOffCommand = new CeilingLightOffCommand(new CeilingLight());
        remoteControl.setCommand(0, ceilingLightOnCommand, ceilingLightOffCommand);

        System.out.println();
        System.out.println(remoteControl);
    }
}
