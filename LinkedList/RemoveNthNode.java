import java.util.*;
public class RemoveNthNode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int n = 2;
        list.remove(list.size() - n);
        System.out.println(list); // [1, 2, 3, 5]
    }
}
