package two.test.source;

/**
 * Created by Pankaj Nimgade on 01-04-2016.
 */
public class TestDrivePizzaStore {

    public static void main(String[] args){
        System.out.println("Start");

        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

        System.out.println();

        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("greek");

        System.out.println();

        pizzaStore = new CaliforniaStylePizzaStore();
        pizzaStore.orderPizza("pepperoni");
    }
}
