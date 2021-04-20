package two;

public class Cow extends Animal {

    private final String COW_SOUND = "moo";
    private final String COW_CONSTRUCTOR= "I am a cow";

    public Cow() {
        System.out.println(COW_CONSTRUCTOR);
    }

    @Override
    public void sound() {
        System.out.println(COW_SOUND);
    }
}
