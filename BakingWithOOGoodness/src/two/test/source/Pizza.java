package two.test.source;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 * This interface has the functions which would be implemented by the concrete classes,
 * this {@link Pizza Pizza} Interface would be used for polymorphism
 *
 * @author Pankaj Nimgade
 */
public interface Pizza {

    String name = null;
    String dough = null;
    String sauce = null;
    ArrayList<String> toppings = new ArrayList<>();

    /**
     * implementation of this method prepares the Pizza
     */
    void prepare();

    /**
     * implementation of this method bakes the Pizza
     */
    void bake();

    /**
     * implementation of this method cuts the Pizza
     */
    void cut();

    /**
     * implementation of this method boxes the Pizza
     */
    void box();

}
