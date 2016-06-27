package round.off.source;

/**
 * Created by Pankaj Nimgade on 27-06-2016.
 */
public class TestDrive_1 {

    public static void main(String[] args) {

        double a = 1234.051351;
        double roundOff = Math.round(a*100)/1000;

        printText(""+roundOff);

    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
