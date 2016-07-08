package time.date;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 06-07-2016.
 */
public class MyPlacesResponse {

    @SerializedName("html_attributions")
    private String html_attributions;

    @SerializedName("next_page_token")
    private String next_page_token;

    @SerializedName("results")
    private ArrayList<MyPlace> results;

    @SerializedName("status")
    private String status;

    public String getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(String html_attributions) {
        this.html_attributions = html_attributions;
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public ArrayList<MyPlace> getResults() {
        return results;
    }

    public void setResults(ArrayList<MyPlace> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
