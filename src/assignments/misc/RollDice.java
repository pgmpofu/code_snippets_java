package assignments.misc;

/**
 * Simulator for rolling a pair of dice
 */
public class RollDice {
    public static void main(String[] args) {
        int roll1 = (int)(Math.random()*6) + 1;
        int roll2 = (int)(Math.random()*6) + 1;
        System.out.println("Dice 1 " + roll1);
        System.out.println("Dice 2 " + roll2);
        System.out.println("Total  " + (roll1 + roll2));
    }
}
