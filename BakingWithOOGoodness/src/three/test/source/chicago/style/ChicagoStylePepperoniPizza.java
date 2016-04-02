package three.test.source.chicago.style;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    private final String TAG = this.getClass().getSimpleName();

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
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
