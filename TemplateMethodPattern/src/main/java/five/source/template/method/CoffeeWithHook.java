package five.source.template.method;

import java.util.Scanner;

/**
 * Created by Pankaj Nimgade on 27-04-2016.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    boolean customerWantCondiments() {
        String answer = getUserInput();
        if (answer.contentEquals("yes")) {
            return true;
        }else if (answer.contentEquals("no")) {
            return false;
        }
        return super.customerWantCondiments();
    }

    public String getUserInput() {
        System.out.println("Would you like milk and sugar in your coffee (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer == null) {
            return "no";
        }
        if (answer.contentEquals("y")) {
            return "yes";
        }
        return "no";
    }

    protected void brew() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    protected void addCondiments() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }


}
