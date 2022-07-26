package lesson27.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TestPerformence {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        testAddMethod();
    }

    private static void testAddMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        Date start = new Date();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i, String.valueOf(i));
        }
        Date finish = new Date();
        long result = finish.getTime() - start.getTime();
        System.out.println("Array list is " + result);

        LinkedList<String> linkedList = new LinkedList<>();

        Date start1 = new Date();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i, String.valueOf(i));
        }

        Date finish1 = new Date();
        long result1 = finish1.getTime() - start1.getTime();
        System.out.println("Linked list is " + result1);
    }
}
