package four.test.laundryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 * <p>
 *      {@link PantsException} is a subclass of {@link LaundryException} and
 *      it specifies what went wrong with pants
 *     @author Pankaj Nimgade
 */
public class PantsException extends LaundryException {
    /**
     * This {@link PantsException} constructor with String message providing details
     * why the exception happened.
     *
     * @param message this provides what went wrong with pants
     */
    public PantsException(String message) {
        super(message);
    }
}
