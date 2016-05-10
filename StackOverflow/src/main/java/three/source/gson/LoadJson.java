package three.source.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 10-05-2016.
 */
public class LoadJson {

    public static void main(String[] args) throws Exception{

        String url = "http://api.androidhive.info/json/movies.json";
        URL url1 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection)url1.openConnection();
        httpURLConnection.connect();
        String result = IOUtils.toString(httpURLConnection.getInputStream());
        System.out.println(result);
        ArrayList<Movie> movies = (new Gson()).fromJson(result, new TypeToken<ArrayList<Movie>>(){}.getType());
        for (Movie movie: movies) {
            System.out.println("movie: "+movie.getTitle());
        }
    }
}

class Movie{
    private String title;
    private String image;
    private String rating;
    private String releaseYear;
    private String[] genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }
}
