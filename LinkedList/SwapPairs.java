import java.util.*;

public class SwapPairs {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));

        for (int i = 0; i < list.size() - 1; i += 2) {
            Collections.swap(list, i, i+1);
        }

        System.out.println(list); // [2, 1, 4, 3]
    }
}
