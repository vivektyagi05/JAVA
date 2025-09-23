
import java.util.Scanner;


public class Moveelements {
    // public static void ismoves(String name1, int idx,int count, String move) {
    //     if(idx == name1.length()){
    //         for (int i = 0; i < count; i++) {
    //             move += "x";
    //         }
    //         System.out.print(move);
    //         return;
    //     }
    //     char cheack = name1.charAt(idx);
    //     if(cheack == 'e'){
    //         count++;
    //         ismoves(name1, idx+1, count, move);
    //     }else{
    //         move += cheack;
    //         ismoves(name1, idx+1, count, move);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int count = 0;
        String neew = "";
        for (int i = 0; i < name.length(); i++) {
            char ab = name.charAt(i);
            if(ab == 'e'){
                count++;
            }else{
                neew += ab;
            }
            
        }
        for (int i = 0; i < count; i++) {
            neew += "e";
        }
        System.out.print(neew);
    }
}
