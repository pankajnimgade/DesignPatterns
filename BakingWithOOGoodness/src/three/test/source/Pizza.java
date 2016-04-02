package three.test.source;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 * This abstract class has the functions which would be implemented by the concrete Pizza classes,
 * this {@link Pizza Pizza} class would be used for polymorphism
 *
 * @author Pankaj Nimgade
 */
public abstract class Pizza {

    String name;
    protected Dough dough;
    protected Sauce sauce;
    protected ArrayList<Veggies> veggies = new ArrayList<>();
    protected Cheese cheese = null;
    protected Pepperoni pepperoni;
    protected Clam clam;

    /**
     * implementation of this method prepares the Pizza
     */
    public abstract void prepare();

    /**
     * implementation of this method bakes the Pizza
     */
    protected void bake() {
        System.out.println("Bake");
    }

    /**
     * implementation of this method cuts the Pizza
     */
    protected void cut() {
        System.out.println("pizza");
    }

    /**
     * implementation of this method boxes the Pizza
     */
    protected void box() {
        System.out.println("Pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
