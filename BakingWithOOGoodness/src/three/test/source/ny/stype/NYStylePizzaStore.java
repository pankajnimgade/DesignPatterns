package three.test.source.ny.stype;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;
import three.test.source.PizzaStore;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new NYStyleClamPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new NYStyleGreekPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new NYStylePepperoniPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYStyleVeggiePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
