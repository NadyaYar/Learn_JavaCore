package lesson26.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    private static final ArrayList<Order> orderArrayList = new ArrayList<>();

    private static final ArrayList<Order> orderArrayList1 = new ArrayList<>();

    public static void main(String[] args) {

        Order order = new Order(12, 45, "some", "something", "el");

        Order order1 = new Order(13, 57, "some", "something", "el");

        Order order2 = new Order(14, 58, "some", "something", "el");

        Order order3 = new Order(15, 59, "some", "something", "el");

        Order order4 = new Order(16, 52, "some", "something", "el");

        Order order5 = new Order(17, 534, "some", "something", "el");

        Order order6 = new Order(19, 549, "some", "something", "el");

        orderArrayList.add(order);
        orderArrayList.add(order1);
        orderArrayList.add(order2);
        orderArrayList.add(order3);
        orderArrayList.add(order4);

        System.out.println(orderArrayList);

        orderArrayList1.add(order6);
        System.out.println(orderArrayList1);

        orderArrayList.add(4, order1);
        System.out.println(orderArrayList);

        orderArrayList.remove(0);
        System.out.println(orderArrayList);

        orderArrayList.remove(order);
        System.out.println(orderArrayList);

        orderArrayList.addAll(orderArrayList1);
        System.out.println(orderArrayList);


        System.out.println(orderArrayList.subList(3, 5));

        System.out.println(orderArrayList.set(4, order5));

        System.out.println(orderArrayList.contains(order));
        System.out.println(Arrays.toString(orderArrayList.toArray(new Order[0])));

        orderArrayList.clear();
        System.out.println(orderArrayList);

        System.out.println(useList());
    }

    public static ArrayList<Order> useList() {
        if (orderArrayList.size() > 5) {
                return null;
            }
        return orderArrayList;
    }
}


