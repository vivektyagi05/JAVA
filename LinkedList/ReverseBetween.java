import java.util.*;
public class ReverseBetween {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int left = 2, right = 4;

        List<Integer> sub = new ArrayList<>(list.subList(left-1, right));
        Collections.reverse(sub);

        for (int i = 0; i < sub.size(); i++) {
            list.set(left - 1 + i, sub.get(i));
        }

        System.out.println(list); // [1, 4, 3, 2, 5]
    }
}
