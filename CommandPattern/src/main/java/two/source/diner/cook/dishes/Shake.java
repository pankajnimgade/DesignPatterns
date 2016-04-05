package two.source.diner.cook.dishes;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class Shake {

    private final String TAG = this.getClass().getSimpleName();

    public void makeShake(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }
}
