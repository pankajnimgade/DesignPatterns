package three.test.download.images;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.apache.commons.io.IOUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Pankaj Nimgade on 20-06-2016.
 */
public class TestDriveDownloadImages {

    private static final String HTML_PATH = "\\JsoupTutorial\\src\\main\\java\\three\\test\\download\\images\\destinations.json";
    private static final String IMAGE_DIRECTORY_PATH = "\\JsoupTutorial\\src\\main\\java\\three\\test\\download\\images\\img";
    private static final String IMAGE_PATH = "http://pic.triposo.com/ios/salo_3/pic/";

    public static void main(String[] args) throws Exception {
        String file_path = getPath() + HTML_PATH;
        File file = new File(file_path);
        if (file.exists()) {
            printText("yes file exists\n");
            FileInputStream fileInputStream = new FileInputStream(file);
            String text = IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
            printText(text);
            Type type = new TypeToken<ArrayList<Destination>>() {
            }.getType();
            ArrayList<Destination> destinations = (new Gson()).fromJson(text, type);
            printText("" + destinations.size());

            for (Destination destination : destinations) {
                downloadImage(destination);
            }
        }
    }

    private static void downloadImage(Destination destination) {
        String directory = getPath() + IMAGE_DIRECTORY_PATH;
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
        Request request = new Request.Builder().url(IMAGE_PATH  + destination.getLocation() + ".jpg").build();
        try {
            Response execute = okHttpClient.newCall(request).execute();
            BufferedImage read = ImageIO.read(new URL(IMAGE_PATH+destination.getLocation()+".jpg"));
            InputStream inputStream = execute.body().byteStream();
            File file = new File(directory + "\\" + destination.getLocation() + ".jpg");
            if (!file.exists()) {
                file.createNewFile();
            }
            ImageIO.write(read, "jpg", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
