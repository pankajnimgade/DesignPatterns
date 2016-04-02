package three.test.source.california.style;

import two.test.source.Pizza;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class CaliforniaStyleClamPizza implements Pizza {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    public void prepare() {
        System.out.println(TAG+" prepare");
    }

    @Override
    public void bake() {
        System.out.println(TAG+" bake");
    }

    @Override
    public void cut() {
        System.out.println(TAG+" cut");
    }

    @Override
    public void box() {
        System.out.println(TAG+" box");
    }
}
