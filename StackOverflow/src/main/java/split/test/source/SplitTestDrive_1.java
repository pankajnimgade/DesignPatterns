package split.test.source;

/**
 * Created by Pankaj Nimgade on 28-06-2016.
 */
public class SplitTestDrive_1 {

    public static void main(String[] args) {

        String someNumber = "1,35,35,124";
        String[] split = someNumber.split(",");
        printText("Size: "+split.length);
        for (String item : split) {
            printText(item);
        }
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
