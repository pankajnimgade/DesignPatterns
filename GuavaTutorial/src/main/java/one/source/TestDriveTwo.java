package one.source;

import com.google.common.base.Optional;

/**
 * Created by Pankaj Nimgade on 26-06-2016.
 */
public class TestDriveTwo {

    public static void main(String[] args) {
        TestDriveTwo testDriveTwo = new TestDriveTwo();

        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional.fromNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.fromNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        printText("" + testDriveTwo.sum(a, b));
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - checks the value is present or not
        printText("First parameter is present: " + a.isPresent());
        printText("Second parameter is present: " + b.isPresent());

        //Optional.or - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.or(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        return value1 + value2;
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
