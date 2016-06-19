package one.source;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public class RarCompressionStrategy implements CompressionStrategy {

    private static final String TAG = RarCompressionStrategy.class.getSimpleName();

    public void compressFiles(ArrayList<File> files) {
        printText("Algorithm implemented " + TAG);

    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
