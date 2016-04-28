package one.iterator.pattenr.source;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();

        addItems("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItems("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItems("Blueberry Pancake", "Pancakes with fresh blueberries", true, 3.49);
        addItems("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.49);
    }

    private void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuIterator(menuItems);
    }
}
