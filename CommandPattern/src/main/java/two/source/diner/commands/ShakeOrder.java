package two.source.diner.commands;

import two.source.diner.cook.dishes.Shake;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class ShakeOrder implements Order {

    private Shake shake;

    public ShakeOrder(Shake shake) {
        this.shake = shake;
    }

    public void orderUp() {
        this.shake.makeShake();
    }
}
