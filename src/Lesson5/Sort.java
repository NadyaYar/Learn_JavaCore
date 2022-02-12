package Lesson5;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 7, 2};
        System.out.println(Arrays.toString(ArrayFromMinToMax(array1)));
        System.out.println(Arrays.toString(ArrayFromMaxToMin(array1)));
    }

    static int[] ArrayFromMinToMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static int[] ArrayFromMaxToMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
