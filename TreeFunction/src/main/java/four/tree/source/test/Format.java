package four.tree.source.test;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class Format {

    @SerializedName("files")
    HashMap<String, String> map;

    @SerializedName("directory")
    HashMap<String, Format> formats;

    public Format() {
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    public HashMap<String, Format> getFormats() {
        return formats;
    }

    public void setFormats(HashMap<String, Format> formats) {
        this.formats = formats;
    }
}
