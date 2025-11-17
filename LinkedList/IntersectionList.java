import java.util.*;

public class IntersectionList {
    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>(Arrays.asList(4,1,8,4,5));
        LinkedList<Integer> listB = new LinkedList<>(Arrays.asList(5,6,1,8,4,5));

        listA.retainAll(listB);
        System.out.println(listA); // [1, 8, 4, 5] — intersection elements
    }
}
