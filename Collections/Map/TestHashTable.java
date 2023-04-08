import java.util.*;
public class TestHashTable {
    public static void main(String [] args){

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);

        //Iterating
        System.out.println("Iterating through the hashtable");
        for (Map.Entry<Integer, String> e : ht1.entrySet()) {
            System.out.println(e.getKey() + " "
                    + e.getValue());
        }

    }
}
