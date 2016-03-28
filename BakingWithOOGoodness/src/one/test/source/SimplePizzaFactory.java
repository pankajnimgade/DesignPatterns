package one.test.source;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else  if (pizzaType.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza();
        }else  if (pizzaType.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza();
        } else  if (pizzaType.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
