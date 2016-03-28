package five.guess.number;

import java.util.Scanner;

/**
 * Created by Pankaj Nimgade on 28-03-2016.
 *
 * @author Pankaj Nimgade
 *
 */
public class TestDriveGuessNumber {

    private static final String KEY_QUESTION = "Computer: Is the number ";

    private static float previous_Guess = 0;
    private static float current_Guess = 0;
    private static float range_Guess = 0;

    private static final String KEY_READY = "ready";
    private static final String KEY_HIGHER = "higher";
    private static final String KEY_LOWER = "lower";
    private static final String KEY_YES = "yes";
    private static final String KEY_NO = "no";
    private static final String KEY_END = "end";
    private static Scanner input;


    public static void main(String[] args) {
        System.out.println("Number-Guessing game");
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("write \"ready\" to start the game");
        } while (!input.nextLine().equalsIgnoreCase(KEY_READY));

        startGame();

    }

    private static void startGame() {

        String response = null;
        do {
            System.out.println(KEY_QUESTION + current_Guess + " ?");
            input = new Scanner(System.in);
            response = input.next();
//            System.out.println(response);
            if (response.equalsIgnoreCase(KEY_LOWER)) {
                decreasingGuessValue();
            } else if (response.equalsIgnoreCase(KEY_HIGHER)) {
                increasingGuessValue();
            }
        } while (checkResponse(response));

        if (response.equalsIgnoreCase(KEY_YES)) {
            System.out.println("Your Guessed Number is " + current_Guess);
        }
        System.out.println("Game is finished ");
    }

    private static void decreasingGuessValue() {
//        System.out.println("decreasing called, " + "Current: " + current_Guess + " Previous: " + previous_Guess);

        if (current_Guess != 0) {
            float difference = (int) (Math.max(current_Guess, previous_Guess) - Math.min(current_Guess, previous_Guess));
            difference = difference / 2;
            range_Guess = difference;
            previous_Guess = (int) current_Guess;
            current_Guess = (int) (current_Guess - range_Guess);
        } else if (current_Guess == 0) {
            previous_Guess = (int) current_Guess;
            current_Guess = -2;
        }
    }

    private static void increasingGuessValue() {
//        System.out.println("increasing called, " + "Current: " + current_Guess + " Previous: " + previous_Guess);
        if (current_Guess != 0) {
            float difference = (int) (Math.max(current_Guess, previous_Guess) - Math.min(current_Guess, previous_Guess));
            float increment_in_guess = (int) difference * 2;
            previous_Guess = (int) current_Guess;
            if (range_Guess != 0) {
                increment_in_guess = (int)(range_Guess/2);
            }
            current_Guess = (int) (current_Guess + increment_in_guess);
        } else if (current_Guess == 0) {
            previous_Guess = (int) current_Guess;
            current_Guess = 2;
        }
    }

    private static boolean checkResponse(String response) {
        if (response.equalsIgnoreCase(KEY_YES)) {
            return false;
        } else if (response.equalsIgnoreCase(KEY_NO)) {
            return false;
        } else if (response.equalsIgnoreCase(KEY_END)) {
            return false;
        }
        return true;
    }
}
