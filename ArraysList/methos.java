import java.util.*;

public class methos {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Accessing and modifying elements
        fruits.get(0);
        System.out.println("First fruit: " + fruits.get(0));

        // Updating an element
        fruits.set(0, "Apricot");
        System.out.println("After update: " + fruits);

        // Getting the size of the ArrayList
        System.out.println("Size of the list: " + fruits.size());

        // Checking if the list contains a specific element
        System.out.println("Contains Cherry? " + fruits.contains("Cherry"));

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing: " + fruits);

        // Adding elements again
        fruits.add("Fig");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("New fruits: " + fruits);

        // Iterating through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if the ArrayList is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());

        // Converting the ArrayList to an array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array: ");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
        // Finding the index of an element
        System.out.println("Index of Date: " + fruits.indexOf("Date"));

        // hasNext() and next() demonstration using an iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding all elements from another collection
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grape");
        moreFruits.add("Honeydew");
        fruits.addAll(moreFruits);
        System.out.println("After adding more fruits: " + fruits);

        

    }
}
