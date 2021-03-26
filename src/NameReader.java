/**
 * Write a program that asks the user's name,
 * and then greets the user by name. Before
 * outputting the user's name, convert it to upper case letters.
 */

import java.util.Scanner;

public class NameReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            System.out.println("Hello " + name.toUpperCase() + " nice to meet you");
        }
    }
}
