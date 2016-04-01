package two.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public abstract class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new NYStyleGreekPizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
