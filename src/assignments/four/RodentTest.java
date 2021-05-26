package assignments.four;

public class RodentTest {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        rodent.bite();
        rodent.eat();
        rodent.sleep();
        rodent.friendliness();

        System.out.println();

        GuineaPig guineaPig = new GuineaPig();
        guineaPig.bite();
        guineaPig.eat();
        guineaPig.sleep();
        guineaPig.friendliness();

        System.out.println();

        Gerbil gerbil = new Gerbil();
        gerbil.bite();
        gerbil.eat();
        gerbil.sleep();
        gerbil.friendliness();

        System.out.println();

        Hamster hamster = new Hamster();
        hamster.bite();
        hamster.eat();
        hamster.sleep();
        hamster.friendliness();

        System.out.println();

        Mouse mouse = new Mouse();
        mouse.bite();
        mouse.eat();
        mouse.sleep();
        mouse.friendliness();
    }
}
