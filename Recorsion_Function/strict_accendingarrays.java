import java.util.Scanner;

public class strict_accendingarrays {
    public static boolean cheack(int num[], int ind) {
        if(ind==num.length-1){
            return  true;
        }
        if(num[ind]<num[ind+1]){
            return cheack(num, ind+1);
        }else{
            return  false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();     
        }
        System.out.println(cheack(arr,0));
    }
}
