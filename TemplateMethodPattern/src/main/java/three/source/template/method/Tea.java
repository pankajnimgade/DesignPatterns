package three.source.template.method;

/**
 * Created by Pankaj Nimgade on 25-04-2016.
 */
public class Tea extends CaffeineBeverage {

    private final String TAG = this.getClass().getSimpleName();

    public Tea() {
    }

    public void brew() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        System.out.println("Steeping the Tea");
    }

    public void addCondiments() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        System.out.println("Adding the Lemon");
    }
}
