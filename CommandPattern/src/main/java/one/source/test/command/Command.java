package one.source.test.command;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 * <p></p>
 * This is the {@link Command} class is an interface which will be implemented
 * by it's subclasses
 */
public interface Command {

    /**
     * This method is called by the instance of the subclass's when they want to
     * execute corresponding command to the object(instance).
     * <p></p>
     * you would have to implement how that specific subclass will handle the execution
     * */
    void execute();

}
