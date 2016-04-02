package three.test.source.ny.stype;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class NYStyleClamPizza extends Pizza {

    private final String TAG = this.getClass().getSimpleName();
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
        pepperoni = pizzaIngredientFactory.createPepperoni();
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
    protected void box() {
        super.box();
    }
}
