package round.off.source;

import org.apache.commons.lang.math.NumberUtils;

import java.math.BigDecimal;

/**
 * Created by Pankaj Nimgade on 27-06-2016.
 */
public class TestDrive_4 {

    public static void main(String[] args) {
        String someNumber = "-123.13698";
        boolean number = NumberUtils.isNumber(someNumber);
        printText("" + number);
        BigDecimal a = new BigDecimal(someNumber);
        BigDecimal roundOff = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        printText("" + roundOff);
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
