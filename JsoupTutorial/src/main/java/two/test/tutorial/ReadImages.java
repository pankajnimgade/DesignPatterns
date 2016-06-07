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
public class ReadImages {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";


    public static void main(String[] args) throws Exception{

        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            Elements images = document.select("img[src~=(?i)\\.(png|svg|jpe?g|gif)]");
            for (Element image : images) {
                System.out.println("src : " + image.attr("src"));
                System.out.println("height : " + image.attr("height"));
                System.out.println("width : " + image.attr("width"));
                System.out.println("alt : " + image.attr("alt"));
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
