package one.iterator.pattenr.source;

import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeMenuIterator = this.pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = this.dinerMenu.createIterator();
        System.out.println("\n Menu\n----------\nBreakfast");
        printMenu(pancakeMenuIterator);
        System.out.println("\n ----------\nLunch");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()){
            MenuItem menuItem = menuItemIterator.next();
            System.out.println(menuItem);
        }
    }
}
