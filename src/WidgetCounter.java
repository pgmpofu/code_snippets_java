import java.math.BigDecimal;
import java.util.Scanner;

/**
 *A program that asks the user to enter the number of "widgets"
 * they want to buy and the cost per widget. The program should
 * then output the total cost for all the widgets.
 */
public class WidgetCounter {
    public static void main(String[] args) {
        System.out.println("How many widgets do you have?");
        Scanner scanner = new Scanner(System.in);
        BigDecimal qty = BigDecimal.valueOf(scanner.nextInt());
        System.out.println("What is the price per widget?");
        BigDecimal cost = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("Total cost " + cost.multiply(qty));
    }
}
