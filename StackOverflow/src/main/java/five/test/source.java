package five.test;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pankaj Nimgade on 09-06-2016.
 */
public class source {

    public static void main(String[] args) throws Exception {


        List<Message> messages = getMessages();

        for (Message message :messages) {
            printText(message.toString());
        }

    }

    public static List<Message> getMessages() throws Exception {
        ArrayList<Message> messages = new ArrayList<Message>();

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("http://api.chatndate.com/web/api/chats?users=1,3").build();

        Response execute = okHttpClient.newCall(request).execute();
        String json_result = execute.body().string();
        printText(json_result);
      /*  Type type = new TypeToken<ArrayList<Message>>() {
        }.getType();*/
        MyResponse myResponse = (new Gson()).fromJson(json_result, MyResponse.class);
        messages = myResponse.getData();
        return messages;
    }


    public static void printText(String text) {
        System.out.println("" + text);
    }

    private class MyResponse{

        private boolean success;

        private ArrayList<Message> data;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public ArrayList<Message> getData() {
            return data;
        }

        public void setData(ArrayList<Message> data) {
            this.data = data;
        }
    }
}
