package one.tree.source.test;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 30-05-2016.
 */
public class Format {

    private ArrayList<String> strings;

    private ArrayList<Format> formats;

    public Format() {
    }

    public Format(ArrayList<String> strings, ArrayList<Format> formats) {
        this.strings = strings;
        this.formats = formats;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }
}
