package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 10-04-2016.
 */
public class MallardDuck implements Duck {

    private final String TAG = this.getClass().getSimpleName();

    public void quack() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void fly() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }
}
