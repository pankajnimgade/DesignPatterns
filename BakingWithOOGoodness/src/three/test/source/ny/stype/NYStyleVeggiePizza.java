package three.test.source.ny.stype;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class NYStyleVeggiePizza extends Pizza {

    private final String TAG = this.getClass().getSimpleName();

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }

    @Override
    public void bake() {
        System.out.println(TAG + " bake");
    }

    @Override
    public void cut() {
        System.out.println(TAG + " cut");
    }

    @Override
    public void box() {
        System.out.println(TAG + " box");
    }
}
