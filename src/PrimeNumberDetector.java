/**
 * Print all prime numbers from 1 to 10,000
 */
public class PrimeNumberDetector {
    public static void main(String[] args) {
        boolean flag = false;
        for(int i = 1; i <= 10000; i++) {
            if(i == 2 || i == 3) { flag = true;}
            for(int j = 2; j <= i/2; j++) {
                if(i % j != 0) { flag = true; } else { flag = false; }
            }
            if(flag) { System.out.println(i);}
        }
    }
}
