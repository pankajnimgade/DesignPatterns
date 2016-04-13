package two.adapter.pattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Pankaj Nimgade on 13-04-2016.
 */
public class ArrayListAdapter implements Iterator {

    Enumeration enumeration;



    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {

    }
}
