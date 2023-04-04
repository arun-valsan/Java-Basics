/*
    Comparison of Queue and Deque methods
+────────────────+───────────────────────────+
|  Queue Method  |  Equivalent Deque Method  |
+────────────────+───────────────────────────+
| add(e)         | addLast(e)                |
| offer(e)       | offerLast(e)              |
| remove()       | removeFirst()             |
| poll()         | pollFirst()               |
| element()      | getFirst()                |
| peek()         | peekFirst()               |
+────────────────+───────────────────────────+
 */

import java.util.LinkedList;
import java.util.*;

public class retrieveLinkList {
    public static void main(String [] args) {

        //creating a LinkedList
        LinkedList<String> list = new LinkedList<String>();
        String [] str = new String[] {"BMW", "Volvo","Audi", "Porsche", "Tesla"};

        // Add string array to linked list
        // asList option of ArrayList is not applicable here
        Collections.addAll(list,str);

        System.out.println("Linked List contents " + list);

        // Retrieve element
        System.out.println("Peeking into the Linked List");
        for(int i=0; i < list.size(); i++) {
            System.out.println("Value in position " + i + " is "+ list.get(i));
        }

        // peek() vs peekFirst()
        System.out.println("Peek: " + list.peek());
        System.out.println("PeekFirst: "+ list.peekFirst());
        System.out.println("Both peek and peekFirst acts the same way"+ "\n" +
                "peek() is inherited from the Queue interface, which only has access to the head of the queue." +
                "\n" + "Deque is double-ended, so it introduced a peekLast() method and peekFirst() for symmetry");

        // Removing an item from LinkedList
        list.pop();
        System.out.println("After issuing pop() Linked List contents " + list);

        list.remove(0);
        System.out.println("After issuing remove() Linked List contents " + list);


        // Convert LinkedList into an Array the method has
        // no parameter
        Object[] a = list.toArray();

        // Print all elements of the Array
        System.out.println("After converted LinkedList to Array(toArray()): ");
        for (Object element : a)
            System.out.println(element + " ");

        //offer()  to add element
        list.offer("Tata");
        System.out.println("After issuing offer() Linked List contents " + list);

        // Traversing in reverse order
        //Traversing the list of elements in reverse order
        System.out.println("Reverse traversal using descendingIterator()");
        Iterator it=list.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
