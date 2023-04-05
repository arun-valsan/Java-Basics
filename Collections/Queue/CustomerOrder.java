/*
The Comparable interface is used to compare an object of the same class with an instance of that class,
it provides ordering of data for objects of the user-defined class.
The Comparable interface contains the method compareTo to decide the order of the elements.
Override the compareTo method in the Pair class.
Create an array of Pairs and populate the array.
Use the Arrays.sort() function to sort the array.
 */
/* Aim of the below example to create a filter similar to what is present in food delivery app
These filters will allow to sort the restaurants based on rating and delivery time
 */

import java.util.*;

public class CustomerOrder implements Comparable<CustomerOrder> {
    private int orderId;
    private double orderAmount;
    private String customerName;

    public CustomerOrder(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }
    // compareTo is overriding the compare method in comparable interface.
    // oompareTo is part of comparable interface and allows overriding one element
    // compare is part of comparator interface and allows overriding multiple elements of the class
    public int compareTo(CustomerOrder o) {
        int retValue = 0;
        if(o.orderId > this.orderId) {
            retValue = 1;
        }else {
            retValue = -1;
        }
        return retValue;
    }

    public String toString() {
        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

}
