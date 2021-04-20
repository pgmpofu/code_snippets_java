package assignments.two;

import java.util.Scanner;

public class AnimalTest {

    enum AnimalType {
        PIG, SHEEP, COW, DUCK;
    }

    private static final String PROMPT_INVALID = "Animal is either sheep, cow, pig or duck";
    private static final String PROMPT_ANIMAL_NAME = "Please enter animal name or N to exit: ";
    private static final String PROMPT_GOODBYE = "Thank you. Goodbye!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println(PROMPT_ANIMAL_NAME);
            String animalName = scanner.nextLine();
            if (animalName.equalsIgnoreCase("N")) {
                System.out.println(PROMPT_GOODBYE);
                repeat = false;
            } else if (animalName.equalsIgnoreCase(AnimalType.COW.name())) {
                Cow cow = new Cow();
                cow.sound();
            } else if (animalName.equalsIgnoreCase(AnimalType.SHEEP.name())) {
                Sheep sheep = new Sheep();
                sheep.sound();
            } else if (animalName.equalsIgnoreCase(AnimalType.DUCK.name())) {
                Duck duck = new Duck();
                duck.sound();
            } else if (animalName.equalsIgnoreCase(AnimalType.PIG.name())) {
                Pig pig = new Pig();
                pig.sound();
            } else if(!isValid(animalName)) {
                System.out.println(PROMPT_INVALID);
            }
        }
    }

    private static boolean isValid(String animalName) {
        return AnimalType.COW.name().equalsIgnoreCase(animalName) ||
                AnimalType.PIG.name().equalsIgnoreCase(animalName) ||
                AnimalType.DUCK.name().equalsIgnoreCase(animalName) ||
                AnimalType.SHEEP.name().equalsIgnoreCase(animalName);
    }
}