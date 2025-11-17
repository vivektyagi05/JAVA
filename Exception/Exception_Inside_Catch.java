public class Exception_Inside_Catch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block Started");
            int x = 10 / 0; // New exception inside catch
        } finally {
            System.out.println("Finally Executed");
        }
    }
}
