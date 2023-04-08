import java.util.*;
public class MyNameComp implements Comparator<Empl>{
    public int compare(Empl e1, Empl e2) {

        return e1.getName().compareTo(e2.getName());
    }
}
