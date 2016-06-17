package one.test.source;

/**
 * Created by Pankaj Nimgade on 13-06-2016.
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            printText("you can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            printText("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            printText("You can't insert a quarter ");
        } else if (state == SOLD) {
            printText("Please wait, we are already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            printText("Return Quarter");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            printText("You haven't inserted a quarter");
        } else if (state == SOLD) {
            printText("Sorry you already turned the crank");
        } else if (state == SOLD_OUT) {
                    printText("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            printText("You turned");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            printText("You haven't inserted a quarter yet");
        } else if (state == SOLD) {
            printText("Turning twice doesn't get you another gumball");
        } else if (state == SOLD_OUT) {
            printText("You turned but there is no gumballs");
        }
    }

    private void dispense() {
        if (state == SOLD) {
            printText("A gumball comes rolling out of the slot");
            count--;
            if (count == 0) {
                printText("Oops out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            printText("You need to pay first");
        } else if (state == SOLD_OUT) {
            printText("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            printText("No gumball dispensed");
        }
    }


    public static void printText(String text) {
        System.out.println("" + text);
    }

    @Override
    public String toString() {
        return "State: " + state;
    }
}
