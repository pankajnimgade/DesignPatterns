package two.source.template.method;

/**
 * Created by Pankaj Nimgade on 25-04-2016.
 */
public abstract class CaffeineBeverage {

    private final String TAG = this.getClass().getSimpleName();

    public CaffeineBeverage() {
    }

    public abstract void  prepareRecipe();

    public void boilWater(){
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void pourInCup() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }
}
