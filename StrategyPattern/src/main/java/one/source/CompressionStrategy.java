package one.source;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public interface CompressionStrategy {

    void compressFiles(ArrayList<File> files);

}
