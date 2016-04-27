package five.source.template.method;

/**
 * Created by Pankaj Nimgade on 26-04-2016.
 */
public abstract class CaffeineBeverageWithHook {

    private final String TAG = this.getClass().getSimpleName();

    /**
     * This is a template method
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void pourInCup() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    protected abstract void brew();

    /**
     * This is a hook, because the subclass can override this method, but doesn't have to
     */
    boolean customerWantCondiments() {
        return true;
    }

    protected abstract void addCondiments();
}
