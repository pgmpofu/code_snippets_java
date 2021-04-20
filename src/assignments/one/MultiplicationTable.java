package assignments.one;

/**
 * Prints multiplication tables from 1 to 12
 * @author Patience Mpofu
 * @date 04/12/2021
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        final int size = 12;

        for (int i = 0; i < size; i++) {
            if(i > 1) {
                System.out.println(Constants.PROMPT_COLUMN_SEPARATOR);
            }
            for (int j = 0; j < size; j++) {
                if((i + 1) * (j + 1) < 100) {
                    System.out.printf("%d\t%s", (i + 1) * (j + 1), Constants.PROMPT_COLUMN_SEPARATOR);
                } else {
                    System.out.printf("%d%s", (i + 1) * (j + 1), Constants.PROMPT_COLUMN_SEPARATOR);
                }
            }
            System.out.println();
        }
    }
}
