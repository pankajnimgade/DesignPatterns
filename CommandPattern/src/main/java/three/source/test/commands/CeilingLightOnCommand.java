package three.source.test.commands;

import three.source.test.vendor.classes.CeilingLight;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingLightOnCommand implements Command {

    private CeilingLight ceilingLight;

    public CeilingLightOnCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }

    public void execute() {
        this.ceilingLight.on();
    }
}
