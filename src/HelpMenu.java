/**
 * Menu based help system on Java flow of control
 * @author Patience Mpofu
 * @date 04/11/2021
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelpMenu {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println(Constants.PROMPT_HELP_MENU);
            System.out.println(Constants.PROMPT_HELP_ON);

            Scanner scanner = new Scanner(System.in);
            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(Constants.INFO_IF);
                        break;
                    case 2:
                        System.out.println(Constants.INFO_SWITCH);
                        break;
                    case 3:
                        System.out.println(Constants.INFO_FOR);
                        break;
                    case 4:
                        System.out.println(Constants.INFO_WHILE);
                        break;
                    case 5:
                        System.out.println(Constants.INFO_DO_WHILE);
                        break;
                    default:
                        flag = false;
                }
            } catch (InputMismatchException ex) {
                flag = false;
            }
        }
    }
}
