import java.util.Scanner;

public class findFact {
    public static void findfactorealnumber(int a){
        if(a < 0){
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        findfactorealnumber(a);
        sc.close();
    }
    
}
