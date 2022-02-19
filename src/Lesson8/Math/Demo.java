package Lesson8.Math;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder(new int[]{1, 2, 3, 4, 5}, 2, 3);
        System.out.println(Adder.add(2147483646, 100));
        System.out.println(Adder.check());
    }
}

