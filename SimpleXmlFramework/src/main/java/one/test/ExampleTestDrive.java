package one.test;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by Pankaj Nimgade on 07-06-2016.
 */
public class ExampleTestDrive {

    private static final String FILE_PATH = "\\SimpleXmlFramework\\src\\main\\java\\one\\test\\example_1.xml";

    public static void main(String[] args) throws Exception{

        String path = getPath()+FILE_PATH;
        File file = new File(path);

        Serializer serializer = new Persister();

        Example example = new Example("some text", 1231);

        serializer.write(example,file);
    }

    public static String getPath() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
