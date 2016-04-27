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
     */
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    /**
     * This is a primitive method which is abstract right now which means a subclass
     * will provide it's implementation
     */
    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    /**
     * A concrete operation is defined in the abstract class.<br>
     * This is declared final so the subclasses can't override it.<br>
     * It may be used in template method directly or used by subclass.<br>
     * */
    final void concreteOperation() {

    }

    void hook() {
    }
}
