package three.source.test;

import three.source.test.commands.Command;
import three.source.test.commands.NoCommand;

/**
 * Created by Pankaj Nimgade on 05-04-2016.
 * <p></p>
 * This class will act as Invoker in the Command-Pattern.
 * <p>{@link RemoteControl} has been given Commands by someone else,
 *      these command knows how to call {@link Command#execute()} method of concrete implementation
 *      of Command Interface, in this manner Invoker is decoupled from the Receiver</p>
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command command = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = command;
            offCommands[i] = command;
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        undoCommand =  this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
