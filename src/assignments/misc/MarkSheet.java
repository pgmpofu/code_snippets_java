package assignments.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *A program that will read the information in the file and
 * display (on standard output) a message that contains the
 * name of the student and the student's average grade on the three exams
 */
public class MarkSheet {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("testdata.txt"));
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                int grade1 = Integer.parseInt(scanner.nextLine());
                int grade2 = scanner.nextInt();
                int grade3 = scanner.nextInt();

                System.out.println("Student name: "+ name);
                System.out.println("Exam 1:       "+ grade1);
                System.out.println("Exam 2:       "+ grade2);
                System.out.println("Exam 3:       "+ grade3);
                int sum = grade1 + grade2 + grade3;
                System.out.println("Average:      " + (sum/3));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
