package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 10-04-2016.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey say's");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck say's");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("The TurkeyAdapter say's");
        duck.quack();
        duck.fly();
    }
}
