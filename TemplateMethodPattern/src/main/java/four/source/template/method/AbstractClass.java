package four.source.template.method;

/**
 * Created by Pankaj Nimgade on 26-04-2016.
 */
public abstract class AbstractClass {

    /**
     * The Template Method Pattern defines the skeleton of an algorithm in a method,
     * deferring some steps to subclasses.<br>
     * The Template Method lets subclasses redefine certain steps of an algorithm
     * without changing the algorithm's structure.
     * */
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    protected abstract void concreteOperation();

    protected abstract void hook();
}
