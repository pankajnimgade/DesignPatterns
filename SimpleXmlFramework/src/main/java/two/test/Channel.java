package two.test;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
@Root(name = "channel", strict = false)
public class Channel {

    @Attribute(name = "id", required = false)
    private String id;

    @Element(name = "display-name", required = false)
    private String display_name;

    @Element(name = "url", required = false)
    private String url;

    @Element(name = "icon", required = false)
    private String icon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
