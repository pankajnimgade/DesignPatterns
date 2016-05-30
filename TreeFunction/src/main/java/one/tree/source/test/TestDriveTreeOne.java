package one.tree.source.test;

import java.io.File;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class TestDriveTreeOne {

    private static final String TAG = TestDriveTreeOne.class.getSimpleName();
    private static final String PATH = "F:\\Resume";

    public static void main(String[] args) throws Exception {
        System.out.println(TAG);

        File file = new File(PATH);
        showPath(file.getAbsolutePath());
        showPath("\nStart reading the file\n");

        readFileStructure(file);

    }

    public static void readFileStructure(File file) {
        showPath(file.getAbsolutePath());

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File singleFile : files) {
                readFileStructure(singleFile);
            }
        }

    }

    public static void showPath(String text) {
        System.out.println(text);
    }
}
