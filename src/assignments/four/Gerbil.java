package assignments.four;

public class Gerbil extends Rodent{


    @Override
    public void friendliness() {
        System.out.println("Gerbils can be housed together");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbils are technically nocturnal but may be active during the day and take naps");
    }

    @Override
    public void bite() {
        System.out.println("Gerbils are not know to bite");
    }

    @Override
    public void eat() {
        System.out.println("Gerbils eat like other rodents");
    }
}
