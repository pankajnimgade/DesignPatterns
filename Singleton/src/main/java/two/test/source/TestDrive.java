package two.test.source;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
public class TestDrive {

    public static void main(String[] args){

        InternetConnection internetConnection =InternetConnection.getInstance();
        InternetConnection internetConnection1 =InternetConnection.getInstance();
        InternetConnection internetConnection2 =InternetConnection.getInstance();
        InternetConnection internetConnection3 =InternetConnection.getInstance();



    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
