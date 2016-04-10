package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 10-04-2016.
 * <p> {@link Duck Duck} interface are implemented by the Ducks to implement the Duck behavior(method, function)
 *  {@link #quack() quack()} and {@link #fly() fly()}</p>
 */
public interface Duck {


    /**
     * This implementation will let duck quack
     * */
    void quack();

    /**
     * This implementation will let duck fly.
     * */
    void fly();
}
