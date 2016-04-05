package three.source.test.commands;

import three.source.test.vendor.classes.CeilingFan;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
