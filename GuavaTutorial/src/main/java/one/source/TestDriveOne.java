package one.source;

/**
 * Created by Pankaj Nimgade on 21-06-2016.
 */
public class TestDriveOne {

    public static void main(String args[]) {
        TestDriveOne guavaTester = new TestDriveOne();

        Integer a = null;
        Integer b = new Integer(10);

        System.out.println(guavaTester.sum(a, b));
    }

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
