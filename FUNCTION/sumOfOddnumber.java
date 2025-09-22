import java.util.*;

public class sumOfOddnumber {
    public static void findfactorealnumber(int a){
        if(a < 0){
            System.out.println("Invalid Number");
            return;
        }
        int sum =0;
        for(int i=1; i<=a; i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        findfactorealnumber(a);
    }
    
}
