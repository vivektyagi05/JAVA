import java.util.Scanner;
class bankaccount{
    double balance = 1000;
    void deposit(double amount){
        balance += amount;
    }
    void widraw(double  amount){
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("your low balance");
        }
    }
    void showbal(){
            System.out.println("currently balance: " +balance);
    }            
}
public class balance_acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankaccount acc = new bankaccount();
        int num = sc.nextInt();
        System.out.println("for deposit press d and for withdraw press w");
        char which = sc.next().charAt(0);
        if(which == 'd'){
            acc.deposit(num);
        }
        else if(which == 'w'){
            acc.widraw(num);
        }
        acc.showbal();
    }
}
