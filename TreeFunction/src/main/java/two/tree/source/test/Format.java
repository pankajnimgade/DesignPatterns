package two.tree.source.test;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class Format {

    @SerializedName("fileNameAndPath")
    private ArrayList<String> fileNameAndPath;

    @SerializedName("fileList")
    private ArrayList<Format> formats;

    public Format() {
    }

    public Format(ArrayList<String> fileNameAndPath, ArrayList<Format> formats) {
        this.fileNameAndPath = fileNameAndPath;
        this.formats = formats;
    }

    public ArrayList<String> getFileNameAndPath() {
        return fileNameAndPath;
    }

    public void setFileNameAndPath(ArrayList<String> fileNameAndPath) {
        this.fileNameAndPath = fileNameAndPath;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }
}
