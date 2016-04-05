package one.source.test.command;

import one.source.test.vendor.classes.Sprinkler;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class SprinklerCommand implements Command {

    private Sprinkler sprinkler;

    public SprinklerCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void execute() {
        this.sprinkler.waterOn();
    }
}
