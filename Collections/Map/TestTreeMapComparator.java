import java.util.*;
public class TestTreeMapComparator {
    public static void main(String [] args) {
        //By using name comparator (String comparison)
        TreeMap<Empl,String> tm = new TreeMap<Empl, String>(new MyNameComp());
        tm.put(new Empl("Ram",3000), "RAM");
        tm.put(new Empl("John",6000), "JOHN");
        tm.put(new Empl("Crish",2000), "CRISH");
        tm.put(new Empl("Tom",2400), "TOM");
        // Get the list of keys
        Set<Empl> keys = tm.keySet();
        for(Empl e1:keys){
            System.out.println(e1+" ==> "+tm.get(e1));
        }
        System.out.println("===================================");
        //By using salary comparator (int comparison)
        TreeMap<Empl,String> tm1 = new TreeMap<Empl, String>(new MySalaryComp());
        tm1.put(new Empl("Ram",3000), "RAM");
        tm1.put(new Empl("John",6000), "JOHN");
        tm1.put(new Empl("Crish",2000), "CRISH");
        tm1.put(new Empl("Tom",2400), "TOM");
        //Get the keys
        Set<Empl> ks = tm1.keySet();
        System.out.println("Keys " + tm1.keySet());
        System.out.println("Values " + tm1.values());

        for(Empl e2:ks){
            System.out.println(e2+" ==> "+tm1.get(e2));
        }
    }
}
