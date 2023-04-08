import java.util.*;
public class TestHashMap {
    public static void main(String [] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();

        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // Print and display mapping of HashMap 1
        System.out.println("Initial values of HashMap hm1 are : " + hm1);

        // changing elements in hashmap
        hm1.put(2, "Two");

        System.out.println("After updating second value: " + hm1);

        // remove element with a key
        // using remove method
        hm1.remove(2);
        System.out.println("After removing second value: " + hm1);

        // Iterate the map using
        // for-each loop
        // entrySet() returns the view of the mappings in the map in array format.
        for (Map.Entry<Integer, String> e : hm1.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }

        // checks for the key
        if(hm1.containsKey(1)) {
            System.out.println("Map contains key value 1");
        }
        if(hm1.containsValue("Two")) {
            System.out.println("Map contains key value 1");
        }else {
            System.out.println("Map do not contain value Two");
        }

        // Using keySet() to get the set view of keys
        System.out.println("The set is: " + hm1.keySet());

        // Using values() to get the set view of values
        System.out.println("The collection is: " + hm1.values());

        // Getting the hashcode value for the map
        System.out.println("The hashcode value of the map: "
                + hm1.hashCode());

        // get representation of map using toString()
        String value = hm1.toString();
        System.out.println("String representation of map:" + value);
    }
}
