import java.util.*;

public class PalindromeList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,2,1));
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        System.out.println(list.equals(reversed)); // true
    }
}
