package two.source.diner.cook.dishes;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class Burger {

    private final String TAG = this.getClass().getSimpleName();

    public void makeBurger(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }
}
