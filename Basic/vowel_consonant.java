
import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
