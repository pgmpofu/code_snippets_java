package assignments.two;

/**
 * creates several instances of each animal, and then calls each animal instance’s
 * sound() method, so that different animals print different sounds accordingly.
 * @author Patience Mpofu
 * @date 04/19/2021
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
