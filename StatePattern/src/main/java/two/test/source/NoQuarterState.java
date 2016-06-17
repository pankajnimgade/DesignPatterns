package two.test.source;

/**
 * Created by Pankaj Nimgade on 14-06-2016.
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        printText("You inserted a Quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        printText("You haven't inserted a Quarter");
    }

    public void turnCrank() {
        printText("You turned, but there is no Quarter");
    }

    public void dispense() {
        printText("You need to pay first");
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
