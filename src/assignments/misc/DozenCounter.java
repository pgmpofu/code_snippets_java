package assignments.misc;

import java.util.Scanner;

/**
 *A program that asks the user how many eggs she has
 * and then tells the user how many dozen eggs she has
 * and how many extra eggs are left over.
 */
public class DozenCounter {

    public static void main(String[] args) {
        final int dozen = 12;
        final int gross = 144;

        System.out.println("How many eggs do you have?");

        Scanner scanner = new Scanner(System.in);
        int numOfEggs = scanner.nextInt();

        System.out.println("You have " + (numOfEggs/gross) + " gross");
        System.out.println("You have " + (numOfEggs/dozen) + " dozens");
        System.out.println("You have " + (numOfEggs%dozen) + " remaining");
    }
}
