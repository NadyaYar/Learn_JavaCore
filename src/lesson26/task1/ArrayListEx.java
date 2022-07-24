package lesson26.task1;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        int[] test = new int[5];
        test[0] = 10;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        list.remove(1);
        System.out.println(list.toString());

        list.add(2,33);
        System.out.println(list.toString());

         list.set(1,8);
        System.out.println(list.toString());
    }
}
