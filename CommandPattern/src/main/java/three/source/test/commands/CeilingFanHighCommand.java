package three.source.test.commands;

import three.source.test.vendor.classes.CeilingFan;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();;
    }

    public void undo() {
        ceilingFan.off();
    }
}
