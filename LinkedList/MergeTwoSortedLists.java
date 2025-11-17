import java.util.*;
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
        LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        System.out.println(merged); // [1, 1, 2, 3, 4, 4]
    }
}
