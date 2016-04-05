package two.source.diner;

import two.source.diner.commands.BurgerOrder;
import two.source.diner.commands.Order;
import two.source.diner.cook.dishes.Burger;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class CustomerTestDrive {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        Burger burger = new Burger();
        Order order = new BurgerOrder(burger);
        waiter.takeOrder(order);
        waiter.orderUp();
    }
}
