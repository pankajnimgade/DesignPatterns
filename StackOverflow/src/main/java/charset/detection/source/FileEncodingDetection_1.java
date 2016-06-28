package charset.detection.source;

import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 28-06-2016.
 */
public class FileEncodingDetection_1 {

    public static void main(String[] args){

    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }


    public static void printText(String text) {
        System.out.println("" + text);
    }
}
