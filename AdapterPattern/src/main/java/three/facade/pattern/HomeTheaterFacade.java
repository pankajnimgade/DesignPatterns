package three.facade.pattern;

import three.facade.pattern.sub.system.classes.*;

/**
 * Created by Pankaj Nimgade on 14-04-2016.
 */
public class HomeTheaterFacade {

    private final String TAG = this.getClass().getSimpleName();

    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLight theaterLight;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
                             DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
                             TheaterLight theaterLight, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLight = theaterLight;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);

        popcornPopper.on();
        popcornPopper.pop();

        theaterLight.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDVD();
        amplifier.setSurroundSound();
        amplifier.setVolume();

        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);


        popcornPopper.off();

        theaterLight.off();
        screen.up();
        projector.off();
        amplifier.off();

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
