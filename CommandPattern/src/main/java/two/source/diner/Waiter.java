package two.source.diner;

import two.source.diner.commands.Order;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 * <p></p>
 * This Waiter class encapsulates the Order, it takes the Order from the customer
 * and than lets cook know what to make by calling Waiter{@link #orderUp()} method.
 * Waiter object(instance) does not need to know how the meal is prepared.
 */
public class Waiter {

    Order order;

    public void takeOrder(Order order){
        this.order = order;
    }

    public void orderUp(){
        order.orderUp();
    }
}
