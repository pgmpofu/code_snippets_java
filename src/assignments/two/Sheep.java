package assignments.two;

public class Sheep extends Animal {
    private final String SHEEP_SOUND = "baah";
    private final String SHEEP_CONSTRUCTOR = "I am a sheep";

    public Sheep() {
        System.out.println(SHEEP_CONSTRUCTOR);
    }

    @Override
    public void sound() {
        System.out.println(SHEEP_SOUND);
    }
}
