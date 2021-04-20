package assignments.two;

/**
 * Class  with an default sound() method that does not output a specific animal sound
 * @author Patience Mpofu
 * @date 04/19/2021
 */
public class Animal {
    private final String ANIMAL_SOUND = "An animal makes a sound based on the animal that it is.";
    private final String ANIMAL_CONSTRUCTOR= "I am an animal";

    public Animal() {
        System.out.println(ANIMAL_CONSTRUCTOR);
    }

    public void sound() { System.out.println(ANIMAL_SOUND); }
}
