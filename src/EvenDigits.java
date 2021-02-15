/**
 * Given an array of integers find the number of
 * integers with even number of digits
 */
public class EvenDigits {
    private int evenCounter = 0;

    public int findNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            findNumOfDigits(nums[i]);
        }

        return evenCounter;
    }

    private void findNumOfDigits(int num) {
        int numOfDigits = 1;
        while(num / 10 != 0) {
            numOfDigits++;
            num = num / 10;
        }

        if((numOfDigits % 2) == 0) {
            evenCounter++;
        }
    }
}
