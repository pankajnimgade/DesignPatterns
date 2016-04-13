package three.facade.pattern.sub.system.classes;

/**
 * Created by Pankaj Nimgade on 14-04-2016.
 */
public class PopcornPopper {

    private final String TAG = this.getClass().getSimpleName();

    public PopcornPopper() {
    }

    public void on(){
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void off(){
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void pop(){
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }
}
