package four;

public class Mouse extends Rodent {
    @Override
    public void friendliness() {
        System.out.println("Mice may be friendly or may fight each other");
    }

    @Override
    public void sleep() {
        System.out.println("Mice are not nocturnal");
    }

    @Override
    public void bite() {
        System.out.println("Mice are not know to bite");
    }

    @Override
    public void eat() {
        System.out.println("Mice eat like other rodents");
    }
}
