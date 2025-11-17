
import java.util.Scanner;

class len{
    int len2(String x){

        int result = x.length();
        return result;
    }
}

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");

        int sum = 0;
        for (int i = 0; i < parts.length; i++) {

            len obj = new len();
            sum += obj.len2(parts[i]);
            
        }
        System.out.println(sum+" No " );
    }
}
