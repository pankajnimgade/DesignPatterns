package two.source.diner.commands;

import two.source.diner.cook.dishes.Burger;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class BurgerOrder implements Order {

    private Burger burger;

    public BurgerOrder(Burger burger) {
        this.burger = burger;
    }

    public void orderUp() {
        this.burger.makeBurger();
    }
}
