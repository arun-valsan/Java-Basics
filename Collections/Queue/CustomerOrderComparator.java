import java.util.*;
public class CustomerOrderComparator implements Comparator<CustomerOrder> {

    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2)
    {
        return o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1;
    }
}
