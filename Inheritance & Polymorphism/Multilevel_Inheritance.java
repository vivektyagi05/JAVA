import java.util.Scanner;

class Person{

    String Name;
    int age;
    String empld;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Person Name : ");
        Name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter ID : ");
        empld = sc.next();
        
    }

}

class  Employee extends Person{
    String designation;
    

    void EmployeeName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("EmployeeName : ");
        designation = sc.next();
    }
}

class Salary extends Employee{

    int basic, hra, da;
    double total = 0;



    void calculateGross(){

        Scanner sc = new Scanner(System.in);

        inputDetails();
        EmployeeName();

        System.out.print("Enter basic salary: ");
        basic = sc.nextInt();
        System.out.print("Enter hra salry: ");
        hra = sc.nextInt();
        System.out.print("Enter da salry: ");
        da = sc.nextInt();

        if((0<=basic) && (0<=hra) && (0<=da)){
            total = basic+hra+da;
        }else{
            System.out.println("Please Salary Can Not Give Negative Number : ");
        }

    }

    void display(){


        System.out.println("\n--- Owner Report ---");
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("EmpID : " + empld);
        System.out.println("Designation : " + designation);
        System.out.println("Gross Salary  : " +total);
    }

}

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        Salary obj = new Salary();
        obj.calculateGross();
        obj.display();
        
    }
}
/*

Input: 

Alice 
28 
E101 
Manager 
50000 
8000 
6000

Output: 

Name: Alice 
Age: 28 
EmpID: E101 
Designation: Manager 
Gross Salary: 64000.0

*/