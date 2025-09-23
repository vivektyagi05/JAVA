import java.util.Scanner;
public class patt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int patt = sc.nextInt();

        for(int i = 0; i<patt ;i++){
            for (int j = 1; j<=patt-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
