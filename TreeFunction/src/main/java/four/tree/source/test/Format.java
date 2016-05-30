package four.tree.source.test;

import java.util.HashMap;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class Format {

    HashMap<String, String> map;

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
