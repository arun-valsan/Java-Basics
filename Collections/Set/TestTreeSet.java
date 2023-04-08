/*
SortedSet Interface extends the Set Interface. TreeSet class implements this interface
 TreeSet class access and retrieval times are quiet fast.
 non synchronized
 Doesnt allow null elements
 maintains ascending order
 */

import java.util.*;
public class TestTreeSet {
    public static void main(String [] args){
        // creating TreeSet
        TreeSet <Integer>tree_num = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println(" Using higher() to find value greater than a value");
        System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
        System.out.println("Strictly greater than 31 : "+tree_num.higher(31));
        System.out.println("First element " + tree_num.first());
        System.out.println("Last element "+ tree_num.last());

        //Using headset to filter values less than given value
        SortedSet treeheadset = tree_num.headSet(50);
        System.out.println("Values less than 50 " + treeheadset);

    }
}
