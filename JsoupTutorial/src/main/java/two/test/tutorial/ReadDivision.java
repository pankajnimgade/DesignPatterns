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
public class ReadDivision {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";

    public static void main(String[] args) throws Exception {

        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);

        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            Elements divisions = document.select("div[class=tux-feature tux-check-saved-on-hover]");

            for (Element element : divisions) {
                Elements h3 = element.select("h3");
                for (Element h3_item : h3) {
                    printText(h3_item.text());
                }
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
