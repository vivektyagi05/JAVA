
public class Two_d {
    public static void main(String[] args) {
        // search an element in 2d array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };  
        int target = 7;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }



    }
    
}
