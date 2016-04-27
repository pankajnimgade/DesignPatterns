package seven.source.template.method;

import java.util.Arrays;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class TestDriveDuck {

    public static void main(String[] args) {

        Duck[] ducks = {
                new Duck("eight", 8),
                new Duck("second", 2),
                new Duck("forth", 4),
                new Duck("seven", 7),
                new Duck("first", 1),
                new Duck("three", 3),
                new Duck("five", 5)
        };

        System.out.println(Arrays.deepToString(ducks));
        Arrays.sort(ducks);
        System.out.println(Arrays.deepToString(ducks));


    }
}
