package one.iterator.pattenr.source;

import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public void remove() {

    }
}
