package three.source.test.commands;

import three.source.test.vendor.classes.CeilingLight;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CeilingLightOffCommand implements Command {

    private CeilingLight ceilingLight;

    public CeilingLightOffCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }

    public void execute() {
        ceilingLight.off();
    }
}
