
import java.util.Scanner;



public class if_condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name  = sc.next();

        switch (name) {
            case "shivam":
                System.out.println("i am shivam");
                break;
            case "vivek":
                System.out.println("i am vivek");
                break;

            default:
                System.out.println("nothing");
        }


    }
}
