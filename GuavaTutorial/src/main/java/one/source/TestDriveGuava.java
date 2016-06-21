package one.source;

import com.google.common.base.Optional;

/**
 * Created by Pankaj Nimgade on 21-06-2016.
 */
public class TestDriveGuava {

    public static void main(String[] args) {
        TestDriveGuava testDriveGuava = new TestDriveGuava();

        Integer invalidInput = null;

        Optional<Integer> a = Optional.of(invalidInput);
        Optional<Integer> b = Optional.of(new Integer(10));

        testDriveGuava.sum(a, b);
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        return a.get() + b.get();
    }
}
