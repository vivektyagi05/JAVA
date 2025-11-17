public class Multiple_Catch_Blocks {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error");
        } finally {
            System.out.println("End of Program");
        }
    }
}
