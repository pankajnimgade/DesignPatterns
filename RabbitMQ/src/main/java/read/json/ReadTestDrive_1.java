package read.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by Pankaj Nimgade on 11-07-2016.
 */
public class ReadTestDrive_1 {

    private static final String json_data = "{\n" +
            "  \"data\": {\n" +
            "    \"translations\": [\n" +
            "      {\n" +
            "        \"translatedText\": \"Hallo Welt\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    public static void main(String[] args) {

        JsonElement jsonElement = (new JsonParser()).parse(json_data);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonObject data = asJsonObject.getAsJsonObject("data");
        JsonArray translations = data.getAsJsonArray("translations");
        JsonObject language_JsonObject = translations.get(0).getAsJsonObject();
        JsonElement jsonElement1 = language_JsonObject.get("translatedText");
        System.out.println(jsonElement1.getAsString());

    }
}
