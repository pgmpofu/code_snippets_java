/**
 * Prints multiplication tables from 1 to 12
 * @author Patience Mpofu
 * @date 04/12/2021
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        final int size = 12;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d\t", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
