package two.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new CaliforniaStyleGreekPizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }
        return pizza;
    }
}
