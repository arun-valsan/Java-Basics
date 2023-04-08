/*
 LinkedHashSet class extends the HashSet class
 maintains the order in which they were inserted
 non-synchronized means multiple threads at a time can access the code
 Multiple operations on LinkedHashSet can be performed at a time
 LinkedHashSet<Data-type> lhs = new LinkedHashSet<Data-type>();
LinkedHashSet<Data-type> lhs = new LinkedHashSet<Data-type>(int size);
LinkedHashSet<Data-type> lhs = new LinkedHashSet<Data-type>(int size,float fillRatio);
Fill ratio determines how full the hash set can be before it is resized.

Overhead of maintaining the insertion order LinkedHashSet is slower than HashSet.
 */

import java.util.*;
public class TestLinkedHashSet {
    public static void main(String [] args) {

        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        // Adding a collection which has duplicates
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        Collection<Integer> d= Arrays.asList(1, 1, 2, 3);
        linkedHashSet.addAll(d);

        System.out.println("Linked hash set " + linkedHashSet);
        Collection<Integer> data1 = Arrays.asList(5,6,7,8,9,10,11,12);
        linkedHashSet.addAll(data1);

        //removeIf()
        System.out.println("Using removeif() to remove elements");
        System.out.println("Linked hash set with elements " + linkedHashSet);
        linkedHashSet.removeIf(data -> data > 7);
        System.out.println("Linked hash after removing values > 7 " + linkedHashSet);

    }
}
