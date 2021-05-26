package assignments.four;

public class GuineaPig extends Rodent {

    @Override
    public void friendliness() {
        System.out.println("Guinea Pigs are extremely friendly and can live in groups");
    }

    @Override
    public void sleep() {
        System.out.println("Guinea Pigs are not nocturnal");
    }

    @Override
    public void bite() {
        System.out.println("Guinea Pigs are least likely to bite");
    }

    @Override
    public void eat() {
        System.out.println("Guinea pigs eat like other rodents fresh hay and veggies");
    }
}
