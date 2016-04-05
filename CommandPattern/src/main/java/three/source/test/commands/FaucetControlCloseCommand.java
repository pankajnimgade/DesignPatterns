package three.source.test.commands;

import three.source.test.vendor.classes.FaucetControl;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class FaucetControlCloseCommand implements Command {

    private FaucetControl faucetControl;

    public FaucetControlCloseCommand(FaucetControl faucetControl) {
        this.faucetControl = faucetControl;
    }

    public void execute() {
        faucetControl.closeValue();
    }
}
