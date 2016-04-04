package one.source.test;

import one.source.test.command.Command;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
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
