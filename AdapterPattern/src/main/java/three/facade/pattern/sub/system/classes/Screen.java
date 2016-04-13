package three.facade.pattern.sub.system.classes;

/**
 * Created by Pankaj Nimgade on 14-04-2016.
 */
public class Screen {

    private final String TAG = this.getClass().getSimpleName();

    public Screen() {
    }

    public void up() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void down() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }
}
