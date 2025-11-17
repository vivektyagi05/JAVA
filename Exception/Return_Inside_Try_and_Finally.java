public class Return_Inside_Try_and_Finally {
    public static int test() {
        try {
            System.out.println("Try Block");
            return 10;
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Returned: " + test());
    }
}
