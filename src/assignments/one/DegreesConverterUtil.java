package assignments.one;

/**
 * Utility class for conversions between degrees and Fahrenheit
 */
public class DegreesConverterUtil {
    public static int degreesToFahrenheit(int temperature) {
        return (temperature * 9/5) + 32;
    }

    public static double degreesToFahrenheit(double temperature) {
        return (temperature * 9/5) + 32;
    }

    public static int fahrenheitToDegrees(int temperature) {
        return (temperature - 32)* 5/9;
    }

    public static double fahrenheitToDegrees(double temperature) {
        return (temperature - 32)* 5/9;
    }
}
