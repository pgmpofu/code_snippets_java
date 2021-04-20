package two;

public class Duck extends Animal{
    private final String DUCK_SOUND = "quack";
    private final String DUCK_CONSTRUCTOR= "I am a duck";

    public Duck() {
        System.out.println(DUCK_CONSTRUCTOR);
    }

    @Override
    public void sound() {
        System.out.println(DUCK_SOUND);
    }
}
