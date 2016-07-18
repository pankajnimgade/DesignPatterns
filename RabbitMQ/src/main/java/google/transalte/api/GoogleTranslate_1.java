package google.transalte.api;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Pankaj Nimgade on 11-07-2016.
 */
public class GoogleTranslate_1 {

    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(20, TimeUnit.SECONDS);
//        String url = "https://www.googleapis.com/language/translate/v2/languages?key=AIzaSyCb47xXjpyCdV9xDRftgCBeYGlCm1g2QSI";
        String url = "https://www.googleapis.com/language/translate/v2?key=AIzaSyCb47xXjpyCdV9xDRftgCBeYGlCm1g2QSI&q=hello+world&source=en&target=de";
        String build_url = url + "&q=hello+world" + "&source=en" + "&target=es";
        Request request = new Request.Builder().url(build_url).build();
        Response execute = okHttpClient.newCall(request).execute();
        String string = execute.body().string();
        System.out.println("result:\n" + string);
    }
}
