package two.test.source;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
public class InternetConnection {

    private static InternetConnection instance = null;


    private InternetConnection() {
        printText("InternetConnection");
    }

    public static InternetConnection getInstance() {
        if (instance == null) {
            printText("create instance of InternetConnection");
            instance = new InternetConnection();
        } else {
            printText("already created");
        }

        return instance;
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
