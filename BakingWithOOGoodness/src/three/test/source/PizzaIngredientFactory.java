package three.test.source;

import java.util.ArrayList;

/**
 * Created by Pankaj Nimgade on 02-04-2016.
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    ArrayList<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
