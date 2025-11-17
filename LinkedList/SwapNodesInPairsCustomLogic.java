import java.util.*;

public class SwapNodesInPairsCustomLogic {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size() - 1; i += 2) {
            int first = list.get(i);
            int second = list.get(i + 1);

            list.set(i, second);
            list.set(i + 1, first);
        }
        System.out.println("Swapped List: " + list);
    }
}
