package one.adpter.pattern;

/**
 * Created by Pankaj Nimgade on 10-04-2016.
 * <p>We need to implement the interface of the type you're adapting to.
 * This is the interface your client expects to see</p>
 */
public class TurkeyAdapter implements Duck {

    /**
     * This adapter helps us, adapt a Turkey instance(object) into Duck type.
     */
    Turkey turkey;

    /**
     * we need to get reference to the Object(instance) of class(type) we are adapting into a Duck type
     * <p> here we do that through constructor</p>
     * */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * Now we need to implement all the methods in the Duck interface<br>
     * the {@link #quack()} behavior will call the implementation in the turkey's {@link Turkey#gobble()}<br>
     * this is how the Turkey's instance will behave as Duck's instance using this Adapter {@link TurkeyAdapter}
     * */
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
