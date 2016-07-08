package time.date;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Pankaj Nimgade on 06-07-2016.
 */
public class MyPlace {

    @SerializedName("geometry")
    private MyGeometry geometry;

    @SerializedName("icon")
    private String icon;

    @SerializedName("name")
    private String name;

    @SerializedName("rating")
    private String rating;

    @SerializedName("vicinity")
    private String vicinity;

    public MyGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(MyGeometry geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public class MyGeometry {

        private String lat;
        private String lng;

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }
}
