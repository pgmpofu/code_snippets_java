package assignments.two;

public class Pig extends Animal{
    private final String PIG_SOUND = "oink";
    private final String PIG_CONSTRUCTOR = "I am a pig";

    public Pig() {
        System.out.println(PIG_CONSTRUCTOR);
    }

    @Override
    public void sound() {
        System.out.println(PIG_SOUND);
    }
}
