package two.test.tutorial;

/**
 * Created by Pankaj Nimgade on 20-06-2016.
 */
public class Destination {

    private String location;

    private String destinationName;

    private String latitude;

    private String longitude;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Name: " + destinationName + ", Location: " + location + ", Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
