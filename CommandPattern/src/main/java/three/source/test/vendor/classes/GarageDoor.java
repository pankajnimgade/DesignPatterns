package three.source.test.vendor.classes;

/**
 * Created by Pankaj Nimgade on 04-04-2016.
 */
public class GarageDoor {

    private final String TAG = this.getClass().getSimpleName();

    public void up(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }

    public void down(){

    }

    public void stop(){

    }

    public void lightOn(){

    }

    public void lightOff(){
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(TAG+"\t running:\t "+methodName);
    }
}
