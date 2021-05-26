package assignments.misc;

import java.util.Scanner;

/**
 *  The program should ask the user to enter their first name
 *  and their last name, separated by a space.
 *  Break the input string up into two strings,
 *  one containing the first name and one containing the last name.
 *  Also output the number of characters in each name, and output the user's initials.
 */
public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println("Enter your first name and last name, separated by a space");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Your first name is " + name.substring(0, name.indexOf(" ")));
        System.out.println("Your first name has " + name.substring(0, name.indexOf(" ")).length() + " characters");
        System.out.println("Your last name is " + name.substring(name.indexOf(" ")+1));
        System.out.println("Your last name has " + name.substring(name.indexOf(" ")+1).length() + " characters");
        System.out.println(String.valueOf(name.charAt(0)).concat(String.valueOf(name.charAt(name.indexOf(" ")+1))));
    }
}
