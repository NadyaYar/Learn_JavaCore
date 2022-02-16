package Lesson8.Math;

public class Arithmetic {
    static int[] array;

    public Arithmetic(int[] array) {
        Arithmetic.array = array;
    }

    public static boolean check() {
        int max = array[0];
        for (int j : array)
            if (j < max) {
                max = j;
            }
        int min = array[0];
        for (int j : array)
            if (j > min) {
                min = j;
            }
        int sum = max + min;
        return sum > 100;
    }
}
