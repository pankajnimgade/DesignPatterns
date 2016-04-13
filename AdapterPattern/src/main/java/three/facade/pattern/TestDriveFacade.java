package three.facade.pattern;

import three.facade.pattern.sub.system.classes.*;

/**
 * Created by Pankaj Nimgade on 13-04-2016.
 */
public class TestDriveFacade {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(),
                        new CdPlayer(), new Projector(), new TheaterLight(),
                        new Screen(), new PopcornPopper());

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
