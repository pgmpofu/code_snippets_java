package assignments.misc; /**
 * Write a program that helps the user count his change.
 * The program should ask how many quarters the user has,
 * then how many dimes, then how many nickels, then how many pennies.
 * Then the program should tell the user how much money he has, expressed in dollars.
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        System.out.println("How many quarters do you have?");
        Scanner scanner = new Scanner(System.in);
        int quarters = scanner.nextInt();
        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();
        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();
        System.out.println("How many pennies do you have?");
        int pennies = scanner.nextInt();

        System.out.println("Quarters      :" + (quarters*25));
        System.out.println("Dimes         :" + (dimes*10));
        System.out.println("Nickels       :" + (nickels*5));
        System.out.println("Pennies       :" + pennies);
        int total = (quarters*25) + (dimes*10) + (nickels*5) + pennies;
        System.out.println("Total change  $" + BigDecimal.valueOf(total).divide(BigDecimal.valueOf(100)));
    }
}