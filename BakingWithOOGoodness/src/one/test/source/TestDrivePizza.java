package one.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class TestDrivePizza {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("cheese");


    }
}
