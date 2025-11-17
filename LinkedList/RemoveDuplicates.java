import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,2,3,3));
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        LinkedList<Integer> result = new LinkedList<>(set);
        System.out.println(result); // [1, 2, 3]
    }
}
