public class TransposeMatrix { 
    public static void main(String[] args) { 
        int arr[][] = {{1, 2, 3}, {4, 5, 6}}; 
        int rows = arr.length, cols = arr[0].length; 
        int transpose[][] = new int[cols][rows]; 
 
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                transpose[j][i] = arr[i][j]; 
            } 
        } 
 
        for (int[] row : transpose) { 
            for (int col : row) System.out.print(col + " "); 
            System.out.println(); 
        } 
    } 
} 