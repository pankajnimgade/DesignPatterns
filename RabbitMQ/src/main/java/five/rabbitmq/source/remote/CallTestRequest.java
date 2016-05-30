package five.rabbitmq.source.remote;

import com.squareup.okhttp.*;

/**
 * Created by Pankaj Nimgade on 28-05-2016.
 */
public class CallTestRequest {

    public static void main(String[] args) {

        try{

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody formBody = new FormEncodingBuilder()
                    .add("from_id", "1")
                    .add("to_id", "2")
                    .add("chat_message", "some message I have sent")
                    .add("languages_id", "1")
                    .add("rabbitmq_exchange_name", "chat.message.exchange")
                    .add("rabbitmq_queue_name", "chat.message.user.2")
                    .add("rabbitmq_routing_key", "chat.message.user.2")
                    .build();

            Request request = new Request.Builder()
                    .url("http://api.chatndate.com/web/api/chats")
                    .post(formBody)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String result = response.body().string();
            System.out.println("result\n"+result);



        /*    URL url1 = new URL(url.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection)url1.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(url.length());
            httpURLConnection.connect();
            String result = IOUtils.toString(httpURLConnection.getInputStream());
            System.out.println("result\n"+result);*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
