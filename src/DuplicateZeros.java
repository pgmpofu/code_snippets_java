public class DuplicateZeros {

    public static void main(String[] args) {

        int[] nums = new int[] {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        for(int num : nums) {
            System.out.println(num);
        }
    }

    public static void duplicateZeros(int[] arr) {
        //shift elements right
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] == 0) {
                for (int i = arr.length - 1; i > j; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[j + 1] = 0;
            }
        }
    }
}
