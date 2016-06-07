package two.test.tutorial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.nio.file.Paths;


/**
 * Created by Pankaj Nimgade on 07-06-2016.
 */
public class TestDriveTwo {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";

    public static void main(String[] args) throws Exception {
        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            printText(document.title());
            printText(document.outerHtml());
        }
    }


    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
