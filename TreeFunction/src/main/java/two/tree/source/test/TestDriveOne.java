package two.tree.source.test;

import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class TestDriveOne {

    public static final String TAG = TestDriveOne.class.getSimpleName();
    public static final String PATH = "F:\\Resume";

    public static void main(String[] args) throws Exception {

        File filePath = new File(PATH);
        showPath(filePath.getAbsolutePath());
        showPath("\nStart reading the file\n");
        
        MyResponse response = new MyResponse();

        Format format = readDirectory(filePath);
        response.setFormat(format);

        String result = (new Gson()).toJson(response);
        showPath("\n");
        showPath(result);
    }

    private static Format readDirectory(File filePath) {
        showPath(filePath.getAbsolutePath());
        Format format = new Format();

        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Format> formats = new ArrayList<Format>();

        if (filePath.exists()) {
            showPath(filePath.getAbsolutePath());
            if (filePath.isFile()) {
                strings.add(readSingleFile(filePath));
            } else if (filePath.isDirectory()) {
                File[] filesList = filePath.listFiles();
                for (File file : filesList) {
                    if (file.isFile()) {
                        strings.add(readSingleFile(filePath));
                    } else if (file.isDirectory()) {
                        formats.add(readDirectory(file));
                    }
                }
            }
        }
        if (strings.size() > 0) {
            format.setFileNameAndPath(strings);
        }
        if (formats.size() > 0) {
            format.setFormats(formats);
        }
        return format;
    }


    public static String readSingleFile(File singleFile) {
        showPath(singleFile.getAbsolutePath());
        return singleFile.getAbsolutePath();
    }

    public static void showPath(String text) {
        System.out.println(text);
    }
}
