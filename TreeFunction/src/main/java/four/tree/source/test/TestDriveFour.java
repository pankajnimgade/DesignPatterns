package four.tree.source.test;

import com.google.gson.Gson;

import java.io.File;
import java.util.HashMap;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class TestDriveFour {

    private static final String TAG = TestDriveFour.class.getSimpleName();
    private static final String PATH = "F:\\books\\ttc";

    public static void main(String[] args) throws Exception {
        showText(TAG);
        File file = new File(PATH);
        showText("Start reading... " + file.getName());

        Format format = readGiveFile(file);

        String result = (new Gson()).toJson(format);
        showText(result);

    }

    public static Format readGiveFile(File file) {
        Format format = new Format();
        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        HashMap<String, Format> formatHashMap = new HashMap<String, Format>();

        if (file.exists()) {

            if (file.isFile()) {
                readSingleFile(file, stringHashMap);
            } else if (file.isDirectory()) {
                File[] filesList = file.listFiles();
                for (File singleFile : filesList) {

                    if (singleFile.exists()) {
                        if (singleFile.isFile()) {
                            readSingleFile(singleFile, stringHashMap);
                        } else if (singleFile.isDirectory()) {
                            readSingleDirectory(singleFile, formatHashMap);
                        }
                    }
                }
            }
            if (stringHashMap.size() > 0) {
                format.setMap(stringHashMap);
            }
            if (formatHashMap.size() > 0) {
                format.setFormats(formatHashMap);
            }
        }
        return format;
    }

    public static HashMap<String, Format> readSingleDirectory(File file, HashMap<String, Format> map) {
        Format format = new Format();
        HashMap<String, String> stringHashMap = new HashMap<String, String>();

        if (file.exists()) {

            if (file.isFile()) {
                readSingleFile(file, stringHashMap);
            } else if (file.isDirectory()) {
                map.put(file.getName(), readGiveFile(file));
            }
        }
        return map;
    }

    public static HashMap<String, String> readSingleFile(File singleFile, HashMap<String, String> map) {
        map.put(singleFile.getName(), singleFile.getAbsolutePath());
        return map;
    }


    public static void showText(String text) {
        System.out.println(text);
    }

}
