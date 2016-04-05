package one.source.test.command;

import one.source.test.vendor.classes.SecurityControl;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class SecurityCommand implements Command {

    private SecurityControl securityControl;

    public SecurityCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    public void execute() {
        this.securityControl.arm();
    }
}
