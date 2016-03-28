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
    /**this would hold previous guessed value*/
    private static float previous_Guess = 0;
    /**this would hold current guessed value*/
    private static float current_Guess = 0;
    /**this would hold range in which the guessed value could be in */
    private static float range_Guess = 0;

    /**These are some Key values used in the code to compare with users input*/
    private static final String KEY_READY = "ready";
    private static final String KEY_HIGHER = "higher";
    private static final String KEY_LOWER = "lower";
    private static final String KEY_YES = "yes";
    private static final String KEY_NO = "no";
    private static final String KEY_END = "end";

    /**This utility is used from Java to read responses from the user*/
    private static Scanner input;


    public static void main(String[] args) {
        System.out.println("Number-Guessing game");
        Scanner input = new Scanner(System.in);

        /**this loop will continue unless user starts the Game*/
        do {
            System.out.println("write \"ready\" to start the game");
        } while (!input.nextLine().equalsIgnoreCase(KEY_READY));

        startGame();

    }

    /**this is where guessing starts*/
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

    /**decrease the guessed value*/
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

    /**increment guessed value*/
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

    /**
     * Check for the response from user if he wants to quit or we have guessed the number
     * */
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

/**
 * Objective:

 Write a program in Java to play a number-guessing game. The game works as follows:

 The user chooses a number in his mind and types “ready” to indicate to the computer that he is ready to

 begin playing.

 The computer asks a series of questions to arrive at the number the user has in mind. The user can only

 respond with “higher”, “lower” or “yes”.

 The game ends when the user responds with “yes” or “end”.

 Example:

 User chooses number 40 in his mind.

 Computer: Is the number 30?

 User: higher

 Computer: Is the number 50?

 User: lower

 Computer: Is the number 35?

 User: higher

 Computer: Is the number 40?

 User: yes

 Please note:

 1. The program should be written to arrive at the answer asking the least number of questions.

 2. Assume that your program will be used in the real world, so make it robust, and make any

 reasonable assumptions about the other conditions of the game.

 3. Provide working source code; there should be a class with a main method that we can run to play

 the game. If necessary, provide a build script written in Ant, Maven or Gradle.

 4. Working unit tests would be a bonus.

 5. You can include any explanatory notes with your program.
 * */
