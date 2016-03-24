package two.test.source;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 */
public class BadException extends Exception {

    /**
     * <code>BadException</code>  constructor with no arguments
     *
     * */
    public BadException() {
    }

    /**
     * <code>BadException</code>  constructor with detailed message
     *@param message this tells what went wrong
     * */
    public BadException(String message) {
        super(message);
    }
}
