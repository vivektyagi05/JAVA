import java.util.Scanner;


public class namearrys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String number[] = new String[size];
        for(int i=0; i<size; i++){
            number[i] = sc.next(); 
        }
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        

        
    }
}