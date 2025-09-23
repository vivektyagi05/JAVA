
import java.util.Scanner;

public class sum {
    public static void calculatesum(int i, int num , int sum) {
        if(i==num){
            sum+=i;
            System.out.print("total => "+ sum);
            return;
        }
        calculatesum(i+1,num, sum+=i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int num = sc.nextInt();
        
        calculatesum(start,num,0);
    }
}
