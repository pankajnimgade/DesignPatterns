package one.source.easy.rules;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class BusinessData {

    private boolean isGood;

    public BusinessData(boolean isGood) {
        this.isGood = isGood;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
