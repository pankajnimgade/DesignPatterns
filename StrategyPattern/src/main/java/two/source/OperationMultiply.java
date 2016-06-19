package two.source;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public class OperationMultiply implements Strategy {

    private static final String TAG = OperationMultiply.class.getSimpleName();


    public int doOperation(int num1, int num2) {
        printText("Algorithm implemented at "+TAG);
        return num1 * num2;
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
