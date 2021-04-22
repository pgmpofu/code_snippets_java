package four;

public class Hamster extends Rodent{

    @Override
    public void sleep() {
        System.out.println("Hamsters are nocturnal");
    }

    @Override
    public void friendliness() {
        System.out.println("Hamsters housed in pairs may fight, so they should be housed alone");
    }

    @Override
    public void bite() {
        System.out.println("Hamsters are failry aggressive and may bite");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eats like other rodents");
    }
}
