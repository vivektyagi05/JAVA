public class No_Error_in_Try {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Always Runs");
        }
    }
}
