/*
 Works on principle of First-In, First-Out (FIFO)
 Queue is an ordered list where there is a need to maintain the order of the elements.
 Has classes like PriorityQueue and ArrayDeque
 PriorityQueue class extends AbstractQueue and implements the Queue Interface
 Elements are processed in terms of their priority.
 The Iterator provided in method iterator() is not guaranteed to traverse
 the elements of the priority queue in any particular order.
 If ordered traversal is required, consider using Arrays.sort(pq.toArray()).

 The elements of the priority queue are ordered according to their natural ordering,
 or by a Comparator provided at queue construction time, depending on which constructor is used.
 A priority queue does not permit null elements.
 A priority queue relying on natural ordering also does not permit insertion of non-comparable objects
 */
import java.util.*;
public class testQueue {
    public static void main(String [] args){

        // Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        //displaying the initial size
        System.out.println("Size at the beginning "+pq.size());

        // Adding elements using add()
        pq.add(99);
        pq.add(88);
        pq.add(77);
        pq.add(66);

        //displaying the PriorityQueue
        System.out.println("New PriorityQueue" + pq);

        //displaying the size
        System.out.println("Size after addition "+pq.size());

        // Printing the top element of the PriorityQueue
        System.out.println("Top-most element " +pq.peek());

        // Printing the top element and removing it
        System.out.println("Removing " +pq.poll());

        //displaying the PriorityQueue
        System.out.println("New PriorityQueue after removal" + pq);

        //display the new size
        System.out.println("Size after removal "+pq.size());

        // Comparator used
        //Returns the comparator used to order the elements in this queue,
        // or null if this queue is sorted according to the natural ordering of its elements.
        //Below result returns a null as there is no priority assigned
        System.out.println("Comparator: " + pq.comparator());

    }
}
