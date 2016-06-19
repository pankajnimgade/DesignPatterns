package one.source;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public class CompressionContext {

    private static final String TAG = CompressionContext.class.getSimpleName();
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        printText("setCompressionStrategy");
        this.compressionStrategy = compressionStrategy;
    }

    //use the strategy

    public void createArchive(ArrayList<File> files) {
        printText("createArchive:");
        compressionStrategy.compressFiles(files);
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
