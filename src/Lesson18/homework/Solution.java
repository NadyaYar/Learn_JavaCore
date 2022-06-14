package Lesson18.homework;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNumbers("12324"));

        System.out.println(findNumbers(null));

        System.out.println(findNumbers("1232ear4"));
    }

    private static int findNumbers(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println(input + " not a number");
            return 0;
        }
    }
}
