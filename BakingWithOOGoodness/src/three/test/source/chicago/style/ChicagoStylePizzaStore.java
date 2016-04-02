package three.test.source.chicago.style;

import three.test.source.Pizza;
import three.test.source.PizzaIngredientFactory;
import three.test.source.PizzaStore;
import three.test.source.ny.stype.NYPizzaIngredientFactory;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new ChicagoStyleGreekPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(pizzaIngredientFactory);
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
