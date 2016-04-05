package one.source.test;

import one.source.test.command.Command;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 * <p></p>
 * This is acting as Invoker, it holds the command that would has encapsulated the Receiver
 * who'es execute method will implement the receiver code
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
