package one.test.source;

/**
 * Created by Pankaj Nimgade on 14-06-2016.
 */
public class TestDriveGumballMachine {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        printText(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        printText(gumballMachine.toString());
//
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        printText(gumballMachine.toString());
//
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        printText(gumballMachine.toString());
//
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        printText(gumballMachine.toString());


    }

    public static void printText(String text) {
        System.out.println("" + text);
    }
}
