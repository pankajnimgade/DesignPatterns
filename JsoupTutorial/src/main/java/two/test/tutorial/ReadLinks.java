package two.test.tutorial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 07-06-2016.
 */
public class ReadLinks {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";


    public static void main(String[] args) throws Exception{

        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            printText(document.title());
            Elements links = document.select("a[href]");
            for (Element link : links) {
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }
        }


    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
