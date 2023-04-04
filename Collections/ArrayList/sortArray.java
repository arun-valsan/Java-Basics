import java.util.ArrayList;
import java.util.Collections;

public class sortArray {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();

        // add elements
        str.add("RR");
        str.add("LSG");
        str.add("CSK");
        str.add("SRH");

        System.out.println("Before sorting " + str);
        Collections.sort(str);
        System.out.println("After sorting  " + str);

        //Print contents in different line
        for(String i: str) {
            System.out.println("Value ==> " + i);
        }
    }
}