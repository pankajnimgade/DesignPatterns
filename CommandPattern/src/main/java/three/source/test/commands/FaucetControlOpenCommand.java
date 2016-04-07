package three.source.test.commands;

import three.source.test.vendor.classes.FaucetControl;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class FaucetControlOpenCommand implements Command {

    private FaucetControl faucetControl;

    public FaucetControlOpenCommand(FaucetControl faucetControl) {
        this.faucetControl = faucetControl;
    }

    public void execute() {
        faucetControl.openValue();
    }

    public void undo() {
        faucetControl.closeValue();
    }
}
