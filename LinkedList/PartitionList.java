import java.util.*;
public class PartitionList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,4,3,2,5,2));
        int x = 3;
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        for (int val : list) {
            if (val < x) left.add(val);
            else right.add(val);
        }
        left.addAll(right);
        System.out.println(left); // [1, 2, 2, 4, 3, 5]	    
        }
    }
