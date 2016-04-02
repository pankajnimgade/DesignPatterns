package three.test.source.ny.stype;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class NYStyleCheesePizza extends Pizza {

    private final String TAG = this.getClass().getSimpleName();

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    public void prepare() {
        pepperoni = pizzaIngredientFactory.createPepperoni();
        sauce = pizzaIngredientFactory.createSauce();
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }
}
