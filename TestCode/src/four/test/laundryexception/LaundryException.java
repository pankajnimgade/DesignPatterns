package four.test.laundryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 * This type of exception would be supper class of Laundry related Exception subclasses
 * @author Pankaj Nimgade
 */
public class LaundryException extends Exception{

    /**
     * This {@link LaundryException} constructor with String message providing details
     * why the exception happened.
     * */
    public LaundryException(String message) {
        super(message);
    }
}
