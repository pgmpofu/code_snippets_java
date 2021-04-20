/**
 * Print all prime numbers from 1 to 10,000
 * @author Patience Mpofu
 * @date 04/11/2021
 */
public class PrimeNumberDetector {
    public static void main(String[] args) {
        boolean isPrime;
        for(int i = 1; i <= 10000; i++) {
            isPrime = true;
            for(int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
