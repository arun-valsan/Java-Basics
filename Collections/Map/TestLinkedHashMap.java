import java.util.*;
public class TestLinkedHashMap {
    public static void main(String [] args) {
        LinkedHashMap<Integer, String> lhm1
                = new LinkedHashMap<>();

        lhm1.put(1, "One");
        lhm1.put(2, "Two");
        lhm1.put(3, "Three");
        lhm1.put(4, "Four");
        lhm1.put(5, "Five");

        System.out.println("Values in linked hash map " + lhm1);
        System.out.println("Getting value for key '1': "
                + lhm1.get(1));
        // Using containsKey() method to check for a key
        System.out.println("Contains key '2'? "
                + lhm1.containsKey(2));

        // For-each loop for traversal over Map
        for (Map.Entry<Integer, String> e : lhm1.entrySet()) {

            Integer key = e.getKey();

            // Finding the value
            // using getValue() method
            String value = e.getValue();

            // Printing the key-value pairs
            System.out.println(key + " : " + value);
        }
    }
}