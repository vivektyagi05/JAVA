
import java.util.Scanner;

public class Count_vowels_and_Consonants{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int c=0 , v =0;

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if("aeiou".indexOf(ch) != -1){
                    v++;
                }else{
                    c++;
                }
            }
        }

        System.out.println("Vowels: " + v + "  Consonants: " + c);


    }
}