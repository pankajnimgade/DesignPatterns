package google.transalte.api;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Pankaj Nimgade on 11-07-2016.
 */
public class CheckLanguageSupport {

    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();
        String url = "https://www.googleapis.com/language/translate/v2/languages?key=AIzaSyCb47xXjpyCdV9xDRftgCBeYGlCm1g2QSI";
        Request request = new Request.Builder().url(url).build();
        Response execute = okHttpClient.newCall(request).execute();
        String string = execute.body().string();
        System.out.println("result:\n" + string);
    }
}
