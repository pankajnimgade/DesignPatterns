package three.source.test.vendor.classes;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class CeilingFan {

    private final String TAG = this.getClass().getSimpleName();

    public void high() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }

    public void medium() {

    }

    public void low() {

    }

    public void off() {
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }

    public void getSpeed() {

    }
}
