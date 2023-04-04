
import java.util.*;

public class arrayList {
    public static void main(String args[])
    {
        // create an ArrayList of String type
        ArrayList<String> str = new ArrayList<String>();

        // Initialize an ArrayList with add()
        str.add("RR");
        str.add("LSG");
        str.add("CSK");
        str.add("SRH");

        // to print the ArrayList
        System.out.println("ArrayList is " + str);

        // Manipulations on ArrayList
        // displaying the size
        System.out.println("Size of ArrayList "+str.size());

        //Remove SRH
        str.remove(3);
        System.out.println("ArrayList after removing SRH "+ str);

        // Modify an item at a position
        str.set(1, "MI");

        System.out.println("After modification "+ str);


    }
}
