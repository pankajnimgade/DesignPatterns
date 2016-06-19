package two.source;

/**
 * Created by Pankaj Nimgade on 19-06-2016.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());

        // this will implement OperationAdd concrete Strategy
        float addNumber = context.executeStrategy(2, 5);
        printText("" + addNumber);


        // this will implement OperationSubtract concrete Strategy
        context.setStrategy(new OperationSubtract());
        float subtractNumber = context.executeStrategy(2, 5);
        printText("" + subtractNumber);

        // this will implement OperationMultiply concrete Strategy
        context.setStrategy(new OperationMultiply());
        float multiplyNumber = context.executeStrategy(2, 5);
        printText("" + multiplyNumber);

        /**
         * This example demonstrates how strategy pattern can be used to change the algorithm at runtime
         * */
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
