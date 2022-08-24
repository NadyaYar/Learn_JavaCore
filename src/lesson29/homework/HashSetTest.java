package lesson29.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Order> orders1 = new HashSet<>();

        Set<Order> orders2 = new HashSet<>();

        Order order0 = new Order(1, 34, "something", "something", "h1");
        Order order1 = new Order(2, 12, "something", "something", "h2");
        Order order2 = new Order(3, 32, "something", "something", "h3");
        Order order3 = new Order(4, 87, "something", "something", "h4");
        Order order4 = new Order(5, 10, "something", "something", "h5");
        Order order5 = new Order(6, 66, "something", "something", "h6");
        Order order6 = new Order(7, 61, "something", "something", "h7");

        orders1.add(order0);
        orders1.add(order1);
        orders1.add(order2);
        orders1.add(order3);
        orders1.add(order4);
        orders1.add(order5);

        System.out.println(orders1);

        orders2.add(order0);
        orders2.add(order1);
        orders2.add(order6);

        System.out.println(orders2);

        orders1.remove(order5);

        System.out.println(orders1);

        System.out.println(orders1.retainAll(orders2));

        System.out.println(Arrays.toString(orders1.toArray(new Order[0])));

        System.out.println(orders1.size());
    }
}
