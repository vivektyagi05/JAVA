
public class cap {
    public static void main(String[] args) {
        // capitalize first letter of string
        String str = "hello world, how are you ..?";
        String capitalizedStr = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(capitalizedStr);

    }
}
