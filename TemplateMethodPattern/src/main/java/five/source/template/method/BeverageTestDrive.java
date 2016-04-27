package five.source.template.method;

/**
 * Created by Pankaj Nimgade on 27-04-2016.
 */
public class BeverageTestDrive {

    public static void main(String[] args){
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n Making Tea");
        teaWithHook.prepareRecipe();

        System.out.println("\n\n Making Coffee");
        coffeeWithHook.prepareRecipe();
    }
}
