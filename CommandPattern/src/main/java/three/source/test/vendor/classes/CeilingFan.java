package three.source.test.vendor.classes;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class CeilingFan {

    private final String TAG = this.getClass().getSimpleName();

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        speed =HIGH;
    }

    public void medium() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        speed =MEDIUM;
    }

    public void low() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        speed =LOW;
    }

    public void off() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
        speed =OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
