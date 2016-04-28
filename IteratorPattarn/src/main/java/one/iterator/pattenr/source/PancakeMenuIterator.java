package one.iterator.pattenr.source;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 28-04-2016.
 */
public class PancakeMenuIterator implements Iterator<MenuItem> {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    public void remove() {

    }
}
