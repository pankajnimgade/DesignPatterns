package two.test.source;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 * <p>
 * This code demonstrates how to create your own Exception and handle it.
 * <p>
 * This code shows utilizes {@link BadException BadException}
 */
public class TestDriveTwo {

    public static void main(String[] args){
        System.out.println("Test text");
        try {
            String text = findText(null);
            System.out.println(text);
        }catch (BadException e){
            e.printStackTrace();
        }
    }

    private static String findText(String text) throws BadException{
        if (text == null) {
            throw new BadException("Text is null");
        }
        return text;
    }

}




