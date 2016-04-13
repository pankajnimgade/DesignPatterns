package three.facade.pattern.sub.system.classes;

/**
 * Created by Pankaj Nimgade on 14-04-2016.
 */
public class Projector {

    private final String TAG = this.getClass().getSimpleName();

    private Amplifier amplifier;

    public Projector() {
    }

    public void on() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void off() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void tvMode() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void wideScreenMode() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }


}
