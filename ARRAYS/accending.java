import java.util.Scanner;

public class accending{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();     // like list => 5 4 3 2 1
        }
       for(int j=0;j<arr.length-1;j++){        // 
           for(int k=0;k<arr.length-j-1;k++){
            if(arr[j]>arr[k]){
                int temp = arr[k];
                arr[j] = arr[k];
                temp = arr[j];
                System.out.print(arr[j]+" ...");
            }
         }

       }
       for (int i = 0; i <arr.length; i++) {
        System.out.print(arr[i]+" ");
           
       }
    }
}
