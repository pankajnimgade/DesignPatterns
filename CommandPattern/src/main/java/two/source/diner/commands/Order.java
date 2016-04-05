package two.source.diner.commands;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 * <p></p>
 * This Order class here is acting as Command in Command-Pattern,
 * which has a {@link #orderUp()} method which encapsulate the action being taken
 */
public interface Order {

    /**
     * This is where you will implement how that particular Order is to be made
     * <p></p>
     * This is synonym for execute method is Command-Pattern
     * */
    void orderUp();

}
