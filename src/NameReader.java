import java.util.Scanner;

public class NameReader {
    Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        while (scanner.hasNext()) {
        String name = scanner.nextLine();
        System.out.println("Hello " + name.toUpperCase() + " nice to meet you");
    }
}
