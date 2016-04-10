package three.source.test;

import three.source.test.commands.*;
import three.source.test.vendor.classes.*;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class TestDrive {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("medium");
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);

        CeilingLight ceilingLight = new CeilingLight();
        CeilingLightOnCommand ceilingLightOnCommand = new CeilingLightOnCommand(ceilingLight);
        CeilingLightOffCommand ceilingLightOffCommand = new CeilingLightOffCommand(ceilingLight);
        remoteControl.setCommand(1, ceilingLightOnCommand, ceilingLightOffCommand);

        FaucetControl faucetControl = new FaucetControl();
        FaucetControlOpenCommand faucetControlOpenCommand= new FaucetControlOpenCommand(faucetControl);
        FaucetControlCloseCommand faucetControlCloseCommand = new FaucetControlCloseCommand(faucetControl);
        remoteControl.setCommand(2, faucetControlOpenCommand, faucetControlCloseCommand);

        GarageDoor garageDoor= new GarageDoor();
        GarageDoorUpCommand garageDoorUpCommand= new GarageDoorUpCommand(garageDoor);
        GarageDoorLightOffCommand garageDoorLightOffCommand= new GarageDoorLightOffCommand(garageDoor);
        remoteControl.setCommand(3, garageDoorUpCommand, garageDoorLightOffCommand);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand= new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand= new StereoOffCommand(stereo);
        remoteControl.setCommand(4, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
    }
}
