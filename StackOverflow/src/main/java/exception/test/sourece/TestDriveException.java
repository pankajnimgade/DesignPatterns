package exception.test.sourece;

/**
 * Created by Pankaj Nimgade on 21-06-2016.
 */
public class TestDriveException {

    public static void main(String[] args) {
        MyItem myItem = null;
        validate(myItem, "myItem");


    }

    public static void validate(MyItem myItem, String argumentValue) {
        if (myItem == null) {
            throw new MyArgumentException(argumentValue+" is null");
        }
    }


    private class MyItem {

        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    private static class MyArgumentException extends NullPointerException {

        public MyArgumentException(String s) {
            super(s);
        }
    }
}
