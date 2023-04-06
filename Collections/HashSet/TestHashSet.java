/*
The underlying data structure for HashSet is Hashtable.
Duplicate values are not allowed.
Objects that you insert in HashSet are not guaranteed to be inserted in the same order.
Objects are inserted based on their hash code.
NULL elements are allowed in HashSet.
Initial Capacity: The initial capacity means the number of buckets when hashtable is created.
                  Impelmentation in Java
                    public HashSet(int initialCapacity)
                    {
                         // Creating internally backing HashMap object
                            map = new HashMap(initialCapacity);
                    }
                    The number of buckets will be automatically increased if the current size gets full.
Load Factor: The load factor is a measure of how full the HashSet is allowed to get before its capacity
             is automatically increased.
                             Number of stored elements in the table
             Load Factor = -----------------------------------------
                                  Size of the hash table
             A load factor of 0.75 provides very effective performance with respect to time and space complexity

The implementation in a HashSet is not synchronized, in the sense that
if multiple threads access a hash set concurrently, and at least one of the threads modifies the set,
it must be synchronized externally.
Set s = Collections.synchronizedSet(new HashSet(...));

 */
import java.util.*;
public class TestHashSet {
    public static void main(String [] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<ArrayList> set = new HashSet<>();

        HashSet<String> hs = new HashSet<>();

        // Add elements using add method
        list1.add(1);
        list1.add(2);
        set.add(list1);

        System.out.println("ArrayList hash set");
        System.out.println(set.size());
        System.out.println(set);

        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");

        System.out.println("String hash set");
        System.out.println(hs);

        //Check if an element is present in set
        if(hs.contains("Two")){
            System.out.println("Set contains value Two");
        }

        HashSet<Integer> hsnum1 = new HashSet<>();
        HashSet<Integer> hsnum2 = new HashSet<>();

        hsnum1.add(5);
        hsnum1.add(6);
        hsnum1.add(7);
        hsnum1.add(8);

        hsnum2.add(1);
        hsnum2.add(2);
        hsnum2.add(3);
        hsnum2.add(4);
        hsnum2.add(5);

        System.out.println("HashSet 1");
        System.out.println(hsnum1);
        System.out.println("HashSet 2");
        System.out.println(hsnum2);
        System.out.println("Print using iterator");
        Iterator iterate = hsnum2.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        //Find difference between two hashsets
        System.out.println("Difference between two hash set using removeAll() ");
        hsnum1.removeAll(hsnum2);
        System.out.println("hsnum1 after difference "+ hsnum1);
        System.out.println("Element 5 was common which is removed");

        //Merge two hashset
        System.out.println("Merge two hashset using addAll() method ");
        hsnum2.addAll(hsnum1);
        System.out.println("hsnum2 after adding hsnum1 "+ hsnum2);

        //Intersection

        HashSet<String> batter = new HashSet<>();

        batter.add("Virat");
        batter.add("Rohit");
        batter.add("Sky");
        batter.add("Hardik");
        System.out.println("Batters " + batter);

        HashSet<String> bowler = new HashSet<>();

        bowler.add("Shami");
        bowler.add("Siraj");
        bowler.add("Ashwin");
        bowler.add("Hardik");
        System.out.println("Bowlers " + bowler);

        batter.retainAll(bowler);
        System.out.println("Common player (using retainAll) " + batter);

    }

}
