package two.test.source;

/**
 * Created by Pankaj Nimgade on 14-06-2016.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        printText("Please wait, we are already giving you a gumball");
    }

    public void ejectQuarter() {
        printText("Sorry you already turned the crank");
    }

    public void turnCrank() {
        printText("Turning twice won't give you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            printText("Oops out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
