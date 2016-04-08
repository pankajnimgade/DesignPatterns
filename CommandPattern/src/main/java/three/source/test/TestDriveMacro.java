package three.source.test;

import three.source.test.commands.Command;
import three.source.test.commands.MacroCommand;
import three.source.test.commands.StereoOffCommand;
import three.source.test.commands.StereoOnCommand;
import three.source.test.vendor.classes.Stereo;

/**
 * Created by Pankaj Nimgade on 07-04-2016.
 */
public class TestDriveMacro {

    public static void main(String[] args){

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] partyOn = new Command[]{stereoOnCommand};
        Command[] partyOff = new Command[]{stereoOffCommand};

        MacroCommand partyOnMacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOffMacroCommand = new MacroCommand(partyOff);

        partyOffMacroCommand.execute();
    }
}
