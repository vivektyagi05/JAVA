import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors): ");
        int num = sc.nextInt();

        // Computer choice ek hi baar generate karo
        int comp = rand.nextInt(3);

        // Computer choice print
        switch (comp) {
            case 0 :
                System.out.println("computer choice: rock");
                break;
            case 1 :
                System.out.println("computer choice: paper");
                break;
            case 2 :    
                System.out.println("computer choice: scissors");
                break;       
        }

        // User choice print
        switch (num) {
            case 0 :
                System.out.println("your choice: rock");
                break;
            case 1 :
                System.out.println("your choice: paper");
                break;
            case 2 :    
                System.out.println("your choice: scissors");
                break;
        }

        // Winner check
        if (num == comp) {
            System.out.println("draw");
        }
        else if ((num == 0 && comp == 2) || (num == 1 && comp == 0) || (num == 2 && comp == 1)) {
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }

        sc.close(); // Scanner close karne se warning hat jaayegi
    }
}
