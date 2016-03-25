package third.test.source.scaryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 */
public class TestDriveScaryException {

    public static void main(String[] args){
        System.out.println("Start main");
        try {
            doRisky("yes");
        } catch (ScaryException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");

    }

    public static void doRisky(String test) throws ScaryException{
        System.out.println("start risky");
        if (test.equalsIgnoreCase("yes")) {
            throw new ScaryException("test String is yes so throw exception");
        }
        System.out.println("end risky");
        return;
    }
}
