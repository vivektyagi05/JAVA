import java.util.*;

public class greatestnumber {
    public static void checkGreaternumber(int a,int b){
        if(a < b){
            System.out.println("a greter than b");
        }
        else if(a == b){
            System.out.println("a equal to b");
        }
        else{
            System.out.println("b greter than a");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        checkGreaternumber(a, b);
    }
    
}
