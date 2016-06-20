package two.test.tutorial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 20-06-2016.
 */
public class ReadHeaders {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";


    public static void main(String[] args) throws Exception{

        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);

        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            Elements h3Headers = document.select("h3");
            printText(""+h3Headers.size());
            int count = 0;
            for (Element element: h3Headers) {
                Elements anchor = element.getElementsByTag("a");
                String text = anchor.text();
                printText(text);
                count++;
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
