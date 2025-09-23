
import java.util.Scanner;


public class fibonacci {
    public static void fabnacci_ser(int a, int b, int num) {
        int c = a+b;
        if(num<c){
            return;
        }
        System.out.println(c);
        fabnacci_ser(b, c, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int num = sc.nextInt();
        if(num>=0){
            System.out.println(a);
        }
        if(num>=1){
            System.out.println(b);
            if(num>=2){
                fabnacci_ser(a,b,num);
            }
        }
        
    }
}
