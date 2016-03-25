package four.test.laundryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 * <p></p>
 * {@link LingerieException} is subclass of {@link LaundryException}
 * and Tells what went wrong with lingerie.
 * @author Pankaj Nimgade
 */
public class LingerieException extends LaundryException {
    /**
     * This {@link LingerieException} constructor with String message providing details
     * why the exception happened.
     *
     * @param message this meaages tells what went wrong with lingerie
     */
    public LingerieException(String message) {
        super(message);
    }
}
