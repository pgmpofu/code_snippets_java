/**
 * A table of temperature conversions, starting from −40 degrees
 * (both Fahrenheit and Celsius), and running at 5 degree intervals
 * for 100 entries in each table.
 */
public class HelpMenu {
    public static void main(String[] args) {
        System.out.println(Constants.PROMPT_TABLE_HEADER + " " + Constants.PROMPT_COLUMN_SEPARATOR + Constants.PROMPT_TABLE_HEADER);
        String subheading = "     " + Constants.PROMPT_COLUMN_HEADER_F + "       " + Constants.PROMPT_COLUMN_HEADER_C + "       " + Constants.PROMPT_COLUMN_SEPARATOR + "      " + Constants.PROMPT_COLUMN_HEADER_C + "        " + Constants.PROMPT_COLUMN_HEADER_F;
        System.out.println(subheading);
        double start = -40.000;

        for(int i = 0; i < 100; i++) {
            if(start < -5) {
                System.out.format("%.3f %.3f      %s    %.3f   %.3f\n", start, DegreesConverterUtil.fahrenheitToDegrees(start), Constants.PROMPT_COLUMN_SEPARATOR, start, DegreesConverterUtil.degreesToFahrenheit(start));
            } else if(start == -5) {
                System.out.format(" %.3f %.3f      %s     %.3f   %.3f\n", start, DegreesConverterUtil.fahrenheitToDegrees(start), Constants.PROMPT_COLUMN_SEPARATOR, start, DegreesConverterUtil.degreesToFahrenheit(start));
            }
            else if(start > -5 && start < 10) {
                System.out.format("  %.3f %.3f      %s     %.3f   %.3f\n", start, DegreesConverterUtil.fahrenheitToDegrees(start), Constants.PROMPT_COLUMN_SEPARATOR, start, DegreesConverterUtil.degreesToFahrenheit(start));
            } else if(start >= 10) {
                System.out.format(" %.3f %.3f      %s     %.3f   %.3f\n", start, DegreesConverterUtil.fahrenheitToDegrees(start), Constants.PROMPT_COLUMN_SEPARATOR, start, DegreesConverterUtil.degreesToFahrenheit(start));
            }
            start+=5;
        }
    }
}