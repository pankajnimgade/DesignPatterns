package one.source.test.command;

import one.source.test.vendor.classes.Stereo;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class StereoCommand implements Command {

    private Stereo stereo;

    public StereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
    }
}
