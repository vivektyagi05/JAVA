public class Division_by_Zero {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Inside Try");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
