import java.util.Arrays;

/**
 * Given an array sorted in ascending order,
 * Return an array of its squares sorted in ascending order
 */
public class SortedSquares {

    //Run time N log N
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }

    //Faster implementation as the stream degrades in performance later on
    public int[] sortedSquares2(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}

