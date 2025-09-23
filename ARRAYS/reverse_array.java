import java.util.Arrays;   

public class reverse_array {
    static int[] reverse_array_num(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;  
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int len = nums.length - 1;
        int k = 2;

        k = k % len;

        reverse_array_num(nums, 0, len);

        reverse_array_num(nums, 0, k - 1);

        reverse_array_num(nums, k, len);
        System.out.println("Final Rotated Array: " + Arrays.toString(nums));
    }
}
