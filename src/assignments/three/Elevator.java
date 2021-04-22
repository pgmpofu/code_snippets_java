/**
 * Elevator can be moved between floors in an N-storey building
 */
package assignments.three;

public class Elevator {

    private int N = 0;

    public Elevator() {
        this.N = 5;
    }

    public Elevator(int num) {
        this.N = num;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public void move(int N){
        setN(N);
    }

    protected void finalize() throws Throwable{
        N = 1;
        System.out.println("Elevator ending: elevator returned to the first floor.");
    }
}
