package one.test.source;

/**
 * Created by Pankaj Nimgade on 03-04-2016.
 * <p></p>
 * This class creates only one instance of itself, this represents Singleton Pattern
 */
public class Singleton {

    /**
     * This is the static instance that would be shared in the application.
     * */
    private static Singleton uniqueInstance;

    /**
     * As constructor is private no other class from outside can access it so
     * nobody can instantiate object(instance) of this class.
     * <p></p>
     * object(instance) of this class can only be created though this class
     * */
    private Singleton() {
    }

    /**
     * it's a static method (class method) which can be accessed without
     * creating object(instance) of this class.
     * <p></p>
     * we would be using it to access the uniqueInstance of this class.
     * */
    public static synchronized Singleton getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
