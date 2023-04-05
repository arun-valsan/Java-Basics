/*
Stack class extends the Vector class and it is its subclass.
 - Works on the principle of Last-In, First-Out
 - push() and pop() methods are used to add/delete elements
 - peek(), search(), empty() methods are also used
 */
import java.util.*;
public class testStack {
    public static void main(String [] args) {

        //creating a Stack
        Stack<Integer> s= new Stack<Integer>();

        //displaying the initial size
        System.out.println("Size at the beginning "+s.size());

        //push elements
        s.push(99);
        s.push(88);
        s.push(77);
        s.push(66);
        s.push(55);


        //displaying the Stack
        System.out.println("New Stack" + s);

        //displaying the size
        System.out.println("Size after addition "+s.size());

        //pop the element and display it
        System.out.println("Popped element " + s.pop());

        //display the new Stack
        System.out.println("New Stack after popping"+ s);

        //display the new size
        System.out.println("Size after removal "+s.size());

        //peek method to find the top-most element and display it
        System.out.println("Top-most element " + s.peek());

        //the size remains the same as peek does not remove the element
        System.out.println("Size after Peek "+s.size());

        //Iterating through stack
        Iterator value = s.iterator();
        System.out.println("Traversing through stack using iterator");
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
