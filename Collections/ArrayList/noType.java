import java.util.*;

public class noType {
    public static void main(String [] args) {

        // Create an ArrayList without a type
        ArrayList noType = new ArrayList();

        // Add any type of elements to ArrayList
        noType.add("Type --> String");
        noType.add(123456);
        noType.add(99.99);

        //Print Array List
        System.out.println("Notype ArrayList "+ noType);

        // Iterating ArrayList using Iterator
        Iterator it = noType.iterator();

        // Find elements of array list
        while (it.hasNext()) {

            // Print the elements of ArrayList
            System.out.println(it.next());
        }

        //Casting to integer type
        int x = (Integer)noType.get(1);
        System.out.println("Integer "+ x);
    }
}
