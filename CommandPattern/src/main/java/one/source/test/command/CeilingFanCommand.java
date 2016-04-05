package one.source.test.command;

import one.source.test.vendor.classes.CeilingFan;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingFanCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.ceilingFan.high();
    }
}
