import java.util.*;
public class MySalaryComp implements Comparator<Empl>{
    public int compare (Empl e1, Empl e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}

/*
 int cannot be dereferenced - error message occured when a normal logic to return int value of 1 and -1 were used
 compareTo method works only on Integer not int. Since int is a primitive type there is no method associated
 with it.

 return e1.getSalary().compareTo( e2.getSalary());
 e1.getSalary() returns an int. We cannot use compareTo with a primitive type.
 Another way to resolve this error is to declare salary as Integer instead of int in Empl class.
  */