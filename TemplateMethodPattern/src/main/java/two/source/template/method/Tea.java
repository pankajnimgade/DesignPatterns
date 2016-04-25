package two.source.template.method;

/**
 * Created by Pankaj Nimgade on 25-04-2016.
 */
public class Tea extends CaffeineBeverage {

    private final String TAG = this.getClass().getSimpleName();

    public Tea() {
    }

    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }


    public void steepTeaBag() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void addLemon() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

}
