package Exception;



class InvalidMarksException extends Exception{
    
    public InvalidMarksException(String massege){
        super(massege);
    }
}
public class StudentResultProcessing{

    public static void calculateGrade(int marks){

        //  thiis ussed in throw

        try{

            if(marks < 0 || marks > 100){
                throw new InvalidMarksException("Invalid Marks ");
            }else if(marks >=90){
                System.out.println("Garde a");
            }else if(marks >= 75){
                System.out.println("Grade B");
            }else if(marks >= 50){
                System.out.println("Grade C");
            }else{
                System.out.println("Grade D");
            }
        }catch (InvalidMarksException e) {
            System.out.println("error: "+ e.getMessage());
        }
    }
    public static void main(String[] args) { 
        calculateGrade(115);
        calculateGrade(15);
       
    }
}

