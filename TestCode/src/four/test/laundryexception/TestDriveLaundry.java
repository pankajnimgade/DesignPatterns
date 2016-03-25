package four.test.laundryexception;

/**
 * Created by Pankaj Nimgade on 25-03-2016.
 */
public class TestDriveLaundry {

    public static void main(String[] args){
        System.out.println("Start main");
        Laundry laundry = new Laundry();

        try {
            laundry.doLaundry(false);
        } catch (LingerieException e) {
            e.printStackTrace();
        } catch (PantsException e) {
            e.printStackTrace();
        }
    }
}

class Laundry{

    public void doLaundry(boolean value) throws LingerieException, PantsException{
        if (value) {
            throw new LingerieException("Value is true so it's error :)");
        }else{
            throw new PantsException("Value is false os it's error :)");
        }
    }

}
