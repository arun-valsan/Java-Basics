import java.util.*;
public class TestPQ {
    public static void main(String [] args) {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        System.out.println("Ordered based on order id - descending");
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }

        System.out.println("\n");

        // CustomerOrderComparator is a new class which overrides compare method of comparator interface
        // This created a new sorting patter with order amount as key.
        // Elements in the order queue are sorted based on the order amount.
        System.out.println("Ordered based on order amount - descending");

        Queue<CustomerOrder> customerOrders2 = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders2.add(c1);
        customerOrders2.add(c2);
        customerOrders2.add(c3);
        while (!customerOrders2.isEmpty()) {
            System.out.println(customerOrders2.poll());
        }
    }
}
