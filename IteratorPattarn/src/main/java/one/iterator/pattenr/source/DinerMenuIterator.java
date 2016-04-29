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
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item unless you have done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[position + 1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
