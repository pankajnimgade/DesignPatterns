package one.test.source;

/**
 * Created by Pankaj Nimgade on 03-04-2016.
 */
public class ChocolateBoiler {

    /**
     * volatile keyword ensures that multiple threads handle the uniqueInstance
     * variable correctly when it is being initialized to Singleton instance
     * */
    private volatile static ChocolateBoiler uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {

        this.empty = true;
        this.boiled = false;
    }

    public static  ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * To fill the boiler it must be empty, and once it's full,
     * we can set the empty and boiled flags
     * */
    public void fill(){
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    /**
     * To boil the mixture, the boiler has to be full and not already boiled.
     * Once it is boiled we set the boiled flag to true.
     * */
    public void boil(){
        if (!isEmpty()&&!isBoiled()) {
            boiled = true;
        }
    }

    /**
     * To drain the boiler, it must be full and also boiled.
     * once it is drained we set empty flag back to true.
     * */
    public void drain(){
        if (!isEmpty()&&isBoiled()) {
            empty = true;
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
