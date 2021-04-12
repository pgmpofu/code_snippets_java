/**
 * This program converts Temperatures from Fahrenheit to Celsius and vice versa.
 * @author Patience Mpofu
 * @date 04/11/2021
 */
import java.util.Scanner;

public class DegreesConverter {

    public enum Unit {F, C}

    public static void main(String[] args) {
        String repeat = "Y";
        while (repeat.equalsIgnoreCase("Y")) {
            System.out.println(Constants.PROMPT_ENTER_TEMP);
            Scanner scanner = new Scanner(System.in);
            int temperature = scanner.nextInt();
            //Consume /n that as not used by nextInt()
            scanner.nextLine();


            System.out.println(Constants.PROMPT_ENTER_UNIT);
            String unit = scanner.nextLine();
            if (unit.equalsIgnoreCase(String.valueOf(Unit.C))) {
                int toFahrenheit = DegreesConverterUtil.degreesToFahrenheit(temperature);
                System.out.println("A temperature of " + temperature + " degrees Celcius is equivalent to " + toFahrenheit + " degrees Fahrenheit.");
            } else if (unit.equalsIgnoreCase(String.valueOf(Unit.F))) {
                int toDegrees = DegreesConverterUtil.fahrenheitToDegrees(temperature);
                System.out.println("A temperature of " + temperature + " degrees Fahrenheit is equivalent to " + toDegrees + " degrees Celcius.");
            } else {
                System.out.println(Constants.ERROR_INCORRECT_UNIT);
            }

            System.out.println(Constants.PROMPT_ANOTHER_CONVERSION);
            repeat = scanner.nextLine();
        }
        System.out.println(Constants.PROMPT_GOODBYE);
    }
}
