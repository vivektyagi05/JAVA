
import java.util.Scanner;

public class arithmetic {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = a / b;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);


}
}