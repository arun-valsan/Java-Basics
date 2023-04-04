import java.util.*;

public class convertList {
    public static void main(String args[]) {
        String[] array = {"a", "b", "c", "d", "e"};

        //Method 1 - using asList
        List<String> list = Arrays.asList(array);
        System.out.println(list);

        //Method 2 - Using collections.addAll
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, array);
        System.out.println(list1);

        //Method 3 - Iterating through list and adding
        List<String> list2 = new ArrayList<String>();
        for(String text:array) {
            list2.add(text);
        }
        System.out.println(list2);
    }
}

