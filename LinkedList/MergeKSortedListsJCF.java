import java.util.*;
public class MergeKSortedListsJCF {
    public static void main(String[] args) {
        // Step 1: Represent k sorted linked lists as individual LinkedLists
        List<LinkedList<Integer>> lists = new ArrayList<>();
        lists.add(new LinkedList<>(Arrays.asList(1, 4, 5)));
        lists.add(new LinkedList<>(Arrays.asList(1, 3, 4)));
        lists.add(new LinkedList<>(Arrays.asList(2, 6)));

        // Step 2: Use a PriorityQueue (Min-Heap) to store all numbers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Step 3: Add all elements from all lists to PriorityQueue
        for (LinkedList<Integer> list : lists) {
            pq.addAll(list);
        }

        // Step 4: Extract elements from heap in sorted order
        LinkedList<Integer> mergedList = new LinkedList<>();
        while (!pq.isEmpty()) {
            mergedList.add(pq.poll());  // poll() removes and returns smallest element
        }

        // Step 5: Output
        System.out.println("Merged Sorted List: " + mergedList);
    }
}
