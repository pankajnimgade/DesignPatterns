package three.source.test.commands;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 */
public class NoCommand implements Command {

    public void execute() {
        System.out.println("do nothing");
    }

    public void undo() {

    }
}
