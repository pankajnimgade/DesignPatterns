package round.off.source;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Created by Pankaj Nimgade on 27-06-2016.
 */
public class TestDrive_2 {

    public static void main(String[] args){

        DecimalFormat df=new DecimalFormat("0.00");
        String formate = df.format(12.4355);
        try {
            double finalValue = (Double)df.parse(formate) ;
            printText(""+finalValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
