/**
 * Tests the Elevator class
 * @author Patience Mpofu
 * @date 04/21/2021
 */
package assignments.three;

public class ElevatorTest {
    public static void main(String[] args) throws Throwable {
        Elevator elevator = new Elevator(10);
        System.out.println("First value of elevator " + elevator.getN());

        Elevator elevator2 = new Elevator();
        System.out.println("Second value of elevator "+ elevator2.getN());

        elevator.move(50);
        System.out.println("Third value of elevator "+ elevator.getN());

        elevator.finalize();
        elevator2.finalize();
    }
}
