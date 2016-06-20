package two.test.tutorial;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pankaj Nimgade on 20-06-2016.
 */
public class ReadLatLang {


    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\two\\test\\tutorial\\Japan.html";

    public static void main(String[] args) throws Exception {

        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        List<Destination> destinations = new ArrayList<>();

        if (file.exists()) {
            printText("yes file exists\n");

            Document document = Jsoup.parse(file, "UTF-8");
            Elements divisions = document.select("div[class=col-sm-4]");
            printText(divisions.size() + "");
            for (Element element : divisions) {
                Destination destination = new Destination();

                Element tuxFeatureSelect = element.select("div[class=tux-feature tux-check-saved-on-hover]").get(0);
                Element a = tuxFeatureSelect.getElementsByTag("a").get(0);
                String location = a.attr("href").substring(a.attr("href").lastIndexOf("/")+1);
                destination.setLocation(location);
                destination.setDestinationName(a.text());
                Element mapMarkerSelect = element.select("div[class=map-marker]").get(0);
                destination.setLatitude(mapMarkerSelect.attr("data-lat"));
                destination.setLongitude(mapMarkerSelect.attr("data-lng"));
                printText(destination.toString());
                destinations.add(destination);
            }

            String json_file_path = file.getParent() + "\\destinations.json";
            printText(json_file_path);
            File json_File = new File(json_file_path);
            json_File.createNewFile();
            FileWriter fileWriter = new FileWriter(json_File);
            fileWriter.write((new Gson()).toJson(destinations));
            fileWriter.flush();
            fileWriter.close();
        }
    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
