package one.iterator.pattenr.source;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class TestDrive {

    public static void main(String[] args){

        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
