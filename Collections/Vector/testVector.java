/*
Vector is similar to ArrayList.
1) Used for dynamic arrays.
2) Vector is synchronised. Synchronised means only one thread at a time can access the code.
This means in a multithreading environment, current thread holds the object in runnable or no-runnable state.
3) Vector performance is low

 */
import java.util.*;
public class testVector {

    public static void main(String [] args) {

        //creating a Vector
        Vector<Integer> v= new Vector<Integer>();

        //displaying the size
        System.out.println("Size at the beginning "+v.size());

        //add elements
        v.add(10);
        v.add(11);
        v.add(12);
        v.add(13);

        //displaying the Vector
        System.out.println(v);

        //displaying the size
        System.out.println("Size after addition "+v.size());

        //remove element at index 3
        v.remove(3);

        //display the new Vector
        System.out.println(v);

        //display the new size
        System.out.println("Size after removal "+v.size());

    }
}
