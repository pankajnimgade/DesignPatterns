package two.test;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
@Root(name = "programme", strict = false)
public class Programme {

    @Attribute(name = "channel", required = false)
    private String channel;

    @Attribute(name = "start", required = false)
    private String start;

    @Attribute(name = "stop", required = false)
    private String stop;

    @Element(name = "title", required = false)
    private String title;

    @Element(name = "category", required = false)
    private String category;

    @Element(name = "desc", required = false)
    private String desc;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
