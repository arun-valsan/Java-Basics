/*
The LinkedList class extends the AbstractSequentialList and it also extends the List, Deque and Queue interface.
Each node has two fields- data and next. Data stores the actual piece of information and next points to the next node.
'Next' field is actually the address of the next node.
Elements are not stored in a contiguous memory, so direct access to that element is not possible.
LinkedList is non-synchronised means multiple threads at a time can access the code.
This means if one thread is working on LinkedList, other threads can also get a hold of it
 */

import java.util.*;



public class testLinkList {
    public static void main(String args[]){

        //creating a LinkedList
        LinkedList<String> list= new LinkedList<String>();

        //displaying the initial size
        System.out.println("Size at the beginning "+list.size());

        //add elements
        list.add("RCB");
        list.add("MI");
        list.add("LSG");

        //displaying the LinkedList
        System.out.println("Original Linked List " + list);


        list.addFirst("RR");
        list.addLast("SRH");

        //displaying the LinkedList
        System.out.println("After addFirst and addLast" + list);

        list.add(2,"DC");

        //displaying the LinkedList
        System.out.println("After inserting new element in index 2 " + list);

        //displaying the size
        System.out.println("Size after addition "+list.size());

        //remove element at index 5
        list.remove(5);
        list.remove("LSG");

        //display the new LinkedList
        System.out.println("After deleting two elements "+ list);

        //display the new size
        System.out.println("Size after removal "+list.size());

    }

}
