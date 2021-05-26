package assignments.two;

/**
 * Creates several instances of each animal, and then calls each animal instance’s
 * sound() method, so that different animals print different sounds accordingly.
 * This is the main class that creates instances of each animal
 *
 * Compiling and running instructions
 * Assuming JDK 11 and the CLASSPATH are correctly set up
 * Compile: javac *.java
 * Run : java AnimalSounds.java
 *
 *
 * @author Patience Mpofu
 * @date 04/19/2021
 * @copyright Patience G. Mpofu
 */
public class AnimalSounds {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Pig pig = new Pig();
        Sheep sheep = new Sheep();
        Duck duck = new Duck();
        Cow cow = new Cow();

        animal.sound();
        pig.sound();
        sheep.sound();
        duck.sound();
        cow.sound();
    }
}
