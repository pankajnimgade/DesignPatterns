package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 11-04-2016.
 */
public class TurkeyTestDrive {

    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        System.out.println("Turkey says");
        turkey.gobble();
        turkey.fly();

        Duck duck = new MallardDuck();
        System.out.println("Duck says");
        duck.quack();
        duck.fly();

        System.out.println("DuckAdapter Says");
        Turkey turkey1 = new DuckAdapter(new MallardDuck());
        turkey1.gobble();
        turkey1.fly();
    }
}
