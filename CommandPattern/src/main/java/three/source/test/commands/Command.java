package three.source.test.commands;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 * <p></p>
 * This is the {@link Command} class is an interface which will be implemented
 * by it's subclasses
 * <p> it's Concrete implementation will encapsulate Receiver in them,
 *     when {@link #execute()} is called, the implementation will call the action corresponding
 *     to the Receiver this command has encapsulated </p>
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
