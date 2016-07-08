package four.encryption;

/**
 * Created by Pankaj Nimgade on 30-06-2016.
 */
public class GetInitialsTestDrive {


    public static void main(String[] args){
        System.out.println(""+getInitials("My Name is"));
    }

    public static String getInitials(String name) {
        StringBuilder initials = new StringBuilder();
        boolean addNext = true;
        if (name != null) {
            if (!name.contentEquals("")) {
                for (int i = 0; i < name.length(); i++) {
                    char c = name.charAt(i);
                    if (c == ' ' || c == '-' || c == '.') {
                        addNext = true;
                    } else if (addNext) {
                        initials.append(c);
                        addNext = false;
                    }
                }
            }
        }
        return initials.toString().toUpperCase();
    }
}
