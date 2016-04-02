package three.test.source.ny.stype;

import three.test.source.*;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 02-04-2016.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        veggies.add(new Onion());
        veggies.add(new Garlic());
        veggies.add(new RedPapper());
        veggies.add(new Mushroom());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }
}
