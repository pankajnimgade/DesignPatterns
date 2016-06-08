package two.test;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Pankaj Nimgade on 08-06-2016.
 */
@Root(name = "tv", strict = false)
public class Tv {

    @Attribute(name = "source-data-url", required = false)
    private String source_data_url;

    @Attribute(name = "source-info-name", required = false)
    private String source_info_name;

    @Attribute(name = "source-info-url", required = false)
    private String source_info_url;

    @ElementList(name = "programme",inline = true, required = false)
    private List<Programme> programmes;

    public String getSource_data_url() {
        return source_data_url;
    }

    public void setSource_data_url(String source_data_url) {
        this.source_data_url = source_data_url;
    }

    public String getSource_info_name() {
        return source_info_name;
    }

    public void setSource_info_name(String source_info_name) {
        this.source_info_name = source_info_name;
    }

    public String getSource_info_url() {
        return source_info_url;
    }

    public void setSource_info_url(String source_info_url) {
        this.source_info_url = source_info_url;
    }

    public List<Programme> getProgrammes() {
        return programmes;
    }

    public void setProgrammes(List<Programme> programmes) {
        this.programmes = programmes;
    }
}
