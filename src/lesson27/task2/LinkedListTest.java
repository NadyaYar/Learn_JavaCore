package lesson27.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        Order order = new Order(1, 23, "some", "so", "el");

        useList(order);
    }

    private static void useList(Order order) {

        LinkedList<Order> linkedList = new LinkedList<>();

        LinkedList<Order> linkedList1 = new LinkedList<>();
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        linkedList.add(order);
        System.out.println(linkedList);

        linkedList.add(1, order);
        System.out.println(linkedList);

        linkedList1.add(order);

        linkedList.remove(order);
        System.out.println(linkedList);

        linkedList.addAll(linkedList1);
        System.out.println(linkedList);

        System.out.println(linkedList.subList(2, 3));

        linkedList.set(0, order);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(order));

        System.out.println(Arrays.toString(linkedList.toArray(new Order[0])));

            linkedList.clear();
            System.out.println(linkedList);
    }
}
