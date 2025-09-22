import java.util.Scanner;

public class fiboncciSeries {
    public static void findFiboncciSeries(int n){
        int[] lst = new int[n + 1];  // new list create ki
        lst[0] = 0;  // list me pahla element khud se liya jitki value 0 Hey.
        lst[1] = 1;  // list me dusra element khud se liya jitki value 1 Hey.
        for(int i=2; i<=n; i++){
            lst[i] = lst[i-1] + lst[i-2]; // list me last wale doo element ko add karke list me save kiya .
        }
        for(int j=0;j<=n;j++){
            if(lst[j] <= n){   // agr lsit k element n number se chhote h to print ho jaye .
                System.out.print(lst[j] + " ");
            }
            else{
                break;       // agr list me dee gayi limit se badi value aati h loop se exit ho jayenge |
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // kitne number tak fibonacci series chahiye .
        findFiboncciSeries(num);  // function ko call kiya 


    }
    
}

