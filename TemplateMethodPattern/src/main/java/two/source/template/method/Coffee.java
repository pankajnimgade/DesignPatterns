package two.source.template.method;

/**
 * Created by Pankaj Nimgade on 25-04-2016.
 */
public class Coffee extends CaffeineBeverage {

    private final String TAG = this.getClass().getSimpleName();


    public Coffee() {

    }

    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }


    public void brewCoffeeGrinds() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(TAG + "\t running:\t " + methodName);
    }

    public void addSugarAndMilk() {
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
