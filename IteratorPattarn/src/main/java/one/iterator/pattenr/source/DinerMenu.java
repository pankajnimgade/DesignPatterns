package one.iterator.pattenr.source;

import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[6];

        addItem("Vegetable BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with side od potato salad", false, 3.29);
        addItem("HotDog", "A hot dog, with saurkrunt, relish, onions and topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegitarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegitarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry menu is full! can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
