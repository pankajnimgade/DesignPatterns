package three.test.source.chicago.style;

import three.test.source.*;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 02-04-2016.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarela();
    }

    @Override
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        veggies.add(new Spinach());
        veggies.add(new EggPlant());
        veggies.add(new BlackOlives());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
