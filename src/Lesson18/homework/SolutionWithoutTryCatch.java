package Lesson18.homework;

import java.util.Arrays;

public class SolutionWithoutTryCatch {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findNumbers("123  12 12 er4")));

        System.out.println(Arrays.toString(findNumbers("1 2 5 eww 23er")));
    }

    private static int countWords(String input) {
        String[] strings = input.split(" ");
        int countWords = 0;
        for (String string : strings) {
            if (isNumber(string)) {
                countWords++;
            }
        }
        return countWords;
    }

    private static int[] findNumbers(String input) {
        String[] strings = input.split(" ");
        int[] res = new int[countWords(input)];
        int index = 0;
        for (String string : strings) {
            if (isNumber(string)) {
                res[index] = Integer.parseInt(string);
                index++;
            } else {
                System.out.println(string + "not a number");
            }
        }
        return res;
    }

    private static boolean isNumber(String input) {
        for (char symbol : input.toCharArray()) {
            if (!Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
}


