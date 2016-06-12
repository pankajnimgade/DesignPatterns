package five.test;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Pankaj Nimgade on 11-06-2016.
 */
public class MessageTestDrive {

    static int CurrentPage = 1;
    static int pageCount = 0;
    static String some_url = "http://api.chatndate.com/web/api/chats?users=2,1&direction=backward";
    static String url = "http://api.chatndate.com/web/api/chats?users=2,1&direction=backward";

    public static void main(String[] args) {


        ArrayList<Message> messagesFromURL = new ArrayList<Message>();
        do {
            ArrayList<Message> messages = getMessagesFromURL(url);
            if (messages.size() > 0) {
                messagesFromURL.addAll(messages);
            } else {
                break;
            }
        } while (pageCount >= CurrentPage);


        Collections.sort(messagesFromURL);

        for (Message message : messagesFromURL) {
            printText(message.toString());
        }


    }

    private static ArrayList<Message> getMessagesFromURL(String url) {
        ArrayList<Message> messages = new ArrayList<Message>();

        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder().url(url+"&page="+CurrentPage).build();

            Response execute = okHttpClient.newCall(request).execute();
            String json_result = execute.body().string();
            String current_page = execute.headers().get("X-Pagination-Current-Page");
            if (getNumber(current_page) > 0) {
                CurrentPage = getNumber(current_page);
            }
            String total_page = execute.headers().get("X-Pagination-Page-Count");
            if (getNumber(total_page) > 0) {
                pageCount = getNumber(total_page);
            }
            CurrentPage++;
            printText(current_page);
            printText(total_page);
            printText(json_result);
      /*  Type type = new TypeToken<ArrayList<Message>>() {
        }.getType();*/
            MyResponse myResponse = (new Gson()).fromJson(json_result, MyResponse.class);
            messages = myResponse.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return messages;
    }

    private static int getNumber(String number) {
        if (number != null) {
            if (!number.equalsIgnoreCase("")) {
                if (number.matches("\\d+")) {
                    printText("its a number");
                    return Integer.parseInt(number);
                }
            }
        }
        return 0;
    }


    public static void printText(String text) {
        System.out.println("" + text);
    }

    private class MyResponse {

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
