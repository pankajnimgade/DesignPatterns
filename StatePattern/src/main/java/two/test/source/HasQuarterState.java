package two.test.source;

/**
 * Created by Pankaj Nimgade on 14-06-2016.
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        printText("You can't insert another quarter");
    }

    public void ejectQuarter() {
        printText("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        printText("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        printText("No gumball dispense");
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
