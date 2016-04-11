package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 11-04-2016.
 */
public class DuckAdapter implements Turkey{

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}
