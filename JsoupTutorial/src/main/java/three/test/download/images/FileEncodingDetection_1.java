package three.test.download.images;

import com.glaforge.i18n.io.CharsetToolkit;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 28-06-2016.
 */
public class FileEncodingDetection_1 {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\three\\test\\download\\images\\destinations.json";


    public static void main(String[] args) throws Exception{
        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        Charset charset = CharsetToolkit.guessEncoding(file, 4096, StandardCharsets.UTF_8);
        printText(""+charset);
    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }


    public static void printText(String text) {
        System.out.println("" + text);
    }
}
