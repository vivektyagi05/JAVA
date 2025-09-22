import java.util.Scanner;

class StudentDetails {
    String name;
    int rollNo;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
    }
}

class Marks extends StudentDetails {
    int Marks1, Marks2, Marks3;
    int total = 0;

    void inputMarks() {
        Scanner sc = new Scanner(System.in);

        inputDetails();

        System.out.print("Enter Marks1: ");
        Marks1 = sc.nextInt();
        System.out.print("Enter Marks2: ");
        Marks2 = sc.nextInt();
        System.out.print("Enter Marks3: ");
        Marks3 = sc.nextInt();

        if ((Marks1 >= 0 && Marks1 <= 100) &&
            (Marks2 >= 0 && Marks2 <= 100) &&
            (Marks3 >= 0 && Marks3 <= 100)) {

            total = Marks1 + Marks2 + Marks3;
        } else {
            System.out.println("Invalid Marks!");
            total = 0;
        }
    }

    void display() {
        double per = (total / 300.0) * 100;

        System.out.println("\n--- Student Report ---");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        // System.out.println("Marks1       : " + Marks1);
        // System.out.println("Marks2       : " + Marks2);
        // System.out.println("Marks3       : " + Marks3);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + per + "%");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Marks obj = new Marks();
        obj.inputMarks();   
        obj.display();    
    }
}
