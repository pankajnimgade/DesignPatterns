package three.source.test.commands;

import three.source.test.vendor.classes.CeilingFan;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        ceilingFan.off();
        if (previousSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }else if(previousSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(previousSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(previousSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
