package two.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
