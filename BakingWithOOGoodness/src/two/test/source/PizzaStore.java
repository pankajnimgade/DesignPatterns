package two.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public abstract class PizzaStore {



    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
