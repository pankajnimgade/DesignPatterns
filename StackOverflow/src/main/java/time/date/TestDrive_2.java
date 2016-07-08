package time.date;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pankaj Nimgade on 06-07-2016.
 */
public class TestDrive_2 {

    public static void main(String[] args){
        try{
            String url = "https://maps.googleapis.com/maps/api/place/search/json?location=35.722624,139.771648&radius=50000&types=hospital&sensor=false&key=AIzaSyAp9MzhK_nLJBbPH9RXUNGF_53GaJhIHbk";
            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.setConnectTimeout(15, TimeUnit.SECONDS);
            Request request = new Request.Builder().url(url).build();
            Response execute = okHttpClient.newCall(request).execute();
            String result = execute.body().string();
            System.out.println(""+result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
