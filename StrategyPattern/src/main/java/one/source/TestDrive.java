package one.source;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public class TestDrive {

    public static void main(String[] args){
        CompressionContext compressionContext = new CompressionContext();

        //the context will use ZipCompressionStrategy concrete algorithm
        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        compressionContext.createArchive(new ArrayList<File>());

        //the context will use RarCompressionStrategy concrete algorithm
        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        compressionContext.createArchive(new ArrayList<File>());

        /**
         * This example demonstrates how strategy pattern can be used to change the algorithm at runtime
         * */
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
