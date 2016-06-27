package round.off.source;

import java.math.BigDecimal;

/**
 * Created by Pankaj Nimgade on 27-06-2016.
 */
public class TestDrive_3 {

    public static void main(String[] args){
        BigDecimal a = new BigDecimal("-123.13698");
        BigDecimal roundOff = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(roundOff);
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
