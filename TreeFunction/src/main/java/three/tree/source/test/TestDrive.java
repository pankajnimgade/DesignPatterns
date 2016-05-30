package three.tree.source.test;

import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class TestDrive {

    private static final String TAG = TestDrive.class.getSimpleName();

    public static void main(String[] args) throws Exception {
        showText(TAG);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("file1", "some_file1");
        map.put("file2", "some_file2");
        map.put("file3", "some_file3");

        String result = (new Gson()).toJson(map);
        showText(result);
    }

    public static void showText(String text) {
        System.out.println(text);
    }
}
