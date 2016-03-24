package one.test.source;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Pankaj Nimgade on 24-03-2016.
 */
public class TestDriveOne {

    private static  char[] ALPHABETS = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                                        'O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("########## Phone Number ##########");
        String phone_Number_String = null;
        long phoneNumber_Long;
        do {
            System.out.println("Phone number should be between 7 to 10 digit number");
            phoneNumber_Long = in.nextLong();
            phone_Number_String = String.valueOf(phoneNumber_Long);
            System.out.println("The number is: "+phone_Number_String+" Length: "+phone_Number_String.length());
        }while (phone_Number_String.length() < 7 || phone_Number_String.length() > 10);

        calculateCombinations(phone_Number_String);
    }

    private static void calculateCombinations(String phone_Number_String) {
        char[] phoneNumber_array = phone_Number_String.toCharArray();
        int counter = phoneNumber_array.length;
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();

        for (int i = 0; i <counter ; i++) {
            ArrayList<PhoneNumber> myPhoneNumber = createPhoneNumber(i,phone_Number_String.toCharArray());
            phoneNumbers.addAll(myPhoneNumber);
        }

        System.out.println("Combinations: "+phoneNumbers.size());

        for (PhoneNumber number :phoneNumbers) {
            System.out.println(number.getPhoneNumber());
        }

    }

    private static ArrayList<PhoneNumber> createPhoneNumber(int i, char[] phoneNumber_array) {
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();
        for (int j = 0; j < ALPHABETS.length; j++) {
            phoneNumber_array[i] = ALPHABETS[j];
            PhoneNumber phoneNumber = PhoneNumber.newInstance(String.valueOf(phoneNumber_array));
            phoneNumbers.add(phoneNumber);
        }
        return phoneNumbers;
    }


}

class PhoneNumber{
    private static long id=0;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        id++;
        this.phoneNumber = phoneNumber;
    }

    public static PhoneNumber newInstance(String number){
        return new PhoneNumber(number);
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        PhoneNumber.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}


