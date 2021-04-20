/**
 * Test class for the Book object
 * @author Patience Mpofu
 * @date 04/20/2021
 */
package assignments.two;

import java.util.UUID;

public class BookTest {
    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.setAuthor("John Grisham");
        bookOne.setEdition(2);
        bookOne.setGenre("Thriller");
        bookOne.setYearPublished("2021");
        bookOne.setIsbn(UUID.randomUUID().toString());
        bookOne.setTitle("Runaway Jury");

        Book bookTwo = new Book(UUID.randomUUID().toString(), "Artificial Intelligence", "2008",
                "Peter Norvig", "Textbook", 4, "Penguin Books");

        Book bookThree = new Book();
        bookThree.setAuthor("Jackie Collins");
        bookThree.setEdition(1);
        bookThree.setGenre("Thriller");
        bookThree.setYearPublished("1981");
        bookThree.setIsbn(UUID.randomUUID().toString());
        bookThree.setTitle("Lucky Santangelo");

        System.out.println("------------- Book One --------------------------");
        System.out.println("Title: " + bookOne.getTitle());
        System.out.println("Edition : " + bookOne.getEdition());
        System.out.println("Published : " + bookOne.getYearPublished());
        System.out.println("Author : " + bookOne.getAuthor());
        System.out.println("ISBN : " + bookOne.getIsbn());
        System.out.println("Genre : " + bookOne.getGenre());

        System.out.println("------------- Book Two --------------------------");
        System.out.println("Title: " + bookTwo.getTitle());
        System.out.println("Edition : " + bookTwo.getEdition());
        System.out.println("Published : " + bookTwo.getYearPublished());
        System.out.println("Author : " + bookTwo.getAuthor());
        System.out.println("ISBN : " + bookTwo.getIsbn());
        System.out.println("Genre : " + bookTwo.getGenre());

        System.out.println("------------- Book Three --------------------------");
        System.out.println("Title: " + bookThree.getTitle());
        System.out.println("Edition : " + bookThree.getEdition());
        System.out.println("Published : " + bookThree.getYearPublished());
        System.out.println("Author : " + bookThree.getAuthor());
        System.out.println("ISBN : " + bookThree.getIsbn());
        System.out.println("Genre : " + bookThree.getGenre());


    }
}
