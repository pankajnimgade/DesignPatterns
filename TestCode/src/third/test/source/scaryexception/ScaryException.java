package third.test.source.scaryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 * <p>
 *     This another custom exception for testing exceptions
 * <p>
 * @author Pankaj Nimgade
 */
public class ScaryException extends Exception {

    /**
     * <code>ScaryException</code> Constructor with message
     * which gives details what went wrong
     * */
    public ScaryException(String message) {
        super(message);
    }
}
