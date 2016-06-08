package two.test;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
public class TestDriveTv {

    public static void main(String[] args) throws Exception{

        String path = "http://tvprofil.net/xmltv/data/rai-1.it/weekly_rai-1.it_tvprofil.net.xml";
        URL url = new URL(path);
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.connect();


        Serializer serializer = new Persister();

        Tv tv = serializer.read(Tv.class, httpURLConnection.getInputStream());

        printText(tv.getSource_data_url());
        printText(tv.getSource_info_name());
        printText(tv.getSource_info_url());
        printText("\n");

        for (Programme programme:tv.getProgrammes()){

            printText("##Program##");

            printText(programme.getChannel());
            printText(programme.getStart());
            printText(programme.getStop());
            printText(programme.getTitle());
            printText(programme.getCategory());
            printText(programme.getDesc());

            printText("\n");
        }

    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
