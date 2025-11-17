import java.util.HashSet;
import java.util.Set;


public class HashSet1 {
    public static int countUnique(String text) {
        // A Set is ideal for storing unique items
        Set<Character> uniqueChars = new HashSet<>();
        
        for (int i = 0; i < text.length(); i++) {
            uniqueChars.add(text.charAt(i));
        }
        
        return uniqueChars.size();
    }

    public static void main(String[] args) {
        String test = "Programming is Fun";
        // 'P', 'r', 'o', 'g', 'a', 'm', 'i', 'n', 'g', ' ', 's', 'F', 'u'
        System.out.println("Unique characters: " + countUnique(test)); // Output: 14 (space counts)
    }
}
