package three.source.template.method;

/**
 * Created by Pankaj Nimgade on 25-04-2016.
 */
public class Coffee extends CaffeineBeverage {

    private final String TAG = this.getClass().getSimpleName();


    public Coffee() {

    }

    public void brew() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        System.out.println("Adding Sugar and milk");
    }


}
