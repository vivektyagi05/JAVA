import java.util.Scanner;

public class check_sorted_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Create a Arr[] 
        System.out.println("Enter arr length: ");
        int nm = sc.nextInt();
        int[] arr = new int[nm];
        System.out.println("Enter number: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sort = true;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > arr[i+1]){
                sort = false;
            }
            
        }
        if(sort==true){
            System.out.println("Arr is sort : ");
        }else{
            System.out.println("Arr IS not Sort : ");
        }

    }
}
