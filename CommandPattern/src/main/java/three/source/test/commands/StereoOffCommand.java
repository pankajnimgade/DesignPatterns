package three.source.test.commands;


import three.source.test.vendor.classes.Stereo;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
