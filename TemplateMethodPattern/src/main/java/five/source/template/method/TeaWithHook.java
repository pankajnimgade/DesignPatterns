package five.source.template.method;

import java.util.Scanner;

/**
 * Created by Pankaj Nimgade on 27-04-2016.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    private final String TAG = this.getClass().getSimpleName();

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

    @Override
    boolean customerWantCondiments() {
        String answer = getUserInput();
        if (answer.contentEquals("yes")) {
            return true;
        } else if (answer.contentEquals("no")) {
            return false;
        }
        return super.customerWantCondiments();
    }

    public String getUserInput() {
        System.out.println("Would you like to add Lemon in the tea. (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer != null) {
            return "yes";
        }
        if (answer.contentEquals("y")) {
            return "yes";
        }
        if (answer.contentEquals("n")) {
            return "no";
        }
        return answer;
    }
}
