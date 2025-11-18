import java.util.*;


public class JumpSteps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 5, 6};

        int pos = 1;       // Start at index 0
        int totalSteps = 0;

        while (pos < arr.length) {
            int jump = arr[pos];   // current step value
            totalSteps++;    // add to total walked distance
            pos += jump;           // jump to next position
        }

        System.out.println("Total steps walked: " + totalSteps);
    }
}
