package one.test;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Pankaj Nimgade on 07-06-2016.
 */
@Root(name = "example_", strict = false)
public class Example {

    @Element
    private String text;

    @Attribute
    private int id;

    public Example() {
    }

    public Example(String text, int id) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
