import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private int balance;
    
    public void AccountNumber(int acc) {
        this.accountNumber = acc;
    }

    public void Balance(int bal) {
            this.balance = bal;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Balance: " + balance);
        } else {
            System.out.println("invalid amount!");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();
        System.out.println("Enter Account Number: ");
        int num = sc.nextInt();
        acc.AccountNumber(num);

        System.out.println("Enter Initial Balance: ");
        acc.Balance(num);

        System.out.println("Enter deposit or withdraw: ");
        String choise = sc.next();

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        if(choise.equals("deposit")) {
            acc.deposit(amt);
        } else if (choise.equals("withdraw")) {
            acc.withdraw(amt);
        } else {
            System.out.println("Invalid input");
        }
    }
}
