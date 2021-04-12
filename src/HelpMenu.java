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
                    case 1 -> System.out.println(Constants.INFO_IF);
                    case 2 -> System.out.println(Constants.INFO_SWITCH);
                    case 3 -> System.out.println(Constants.INFO_FOR);
                    case 4 -> System.out.println(Constants.INFO_WHILE);
                    case 5 -> System.out.println(Constants.INFO_DO_WHILE);
                    default -> flag = printGoodbyeMsg();
                }
            } catch (InputMismatchException ex) {
                flag = printGoodbyeMsg();
            }
        }
    }

    private static boolean printGoodbyeMsg() {
        System.out.println(Constants.PROMPT_GOODBYE);
        return false;
    }
}
