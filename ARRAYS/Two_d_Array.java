public class Two_d_Array {
    public static void main(String[] args) {
        // sum of all elements in 2d arrays using for each loop
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum of all elements: " + sum);
        
    }
}
