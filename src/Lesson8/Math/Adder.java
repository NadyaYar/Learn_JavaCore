package Lesson8.Math;

public class Adder extends Arithmetic {
    int a;
    int b;

    public Adder(int[] array, int a, int b) {
        super(array);
        this.a = a;
        this.b = b;
    }

    static long add(int a, int b) {
        return (long) a + (long) b;
    }
}
