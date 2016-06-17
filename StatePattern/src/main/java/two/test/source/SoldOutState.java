package two.test.source;

/**
 * Created by Pankaj Nimgade on 14-06-2016.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        printText("You can't insert a quarter ");
    }

    public void ejectQuarter() {
        printText("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        printText("You turned but there is no gumballs");
    }

    public void dispense() {
        printText("No gumball dispensed");
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }

}
