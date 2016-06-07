package one.test.tutorial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by Pankaj Nimgade on 07-06-2016.
 */
public class TestDriveOne {

    public static void main(String[] args) throws Exception{

        Document document = Jsoup.connect("http://www.javatpoint.com/jsoup-tutorial").get();
        String title = document.title();
        printText(title);
        printText(document.location());
        printText(document.outerHtml());
    }

    public static void printText(String text){
        System.out.println(""+text);
    }
}
