package four.encryption;

import java.util.Random;

/**
 * Created by Pankaj Nimgade on 30-06-2016.
 */
public class TestDrive_1 {

    public static void main(String[] args){

        for (int i = 0; i < 20; i++) {
            System.out.println(""+(new Random()).nextInt(12));
        }
    }
}
