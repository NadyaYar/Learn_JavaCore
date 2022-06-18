package Lesson18.ex2;

public class Convector {
    public static void main(String[] args) {
        System.out.println((inToString(12142)));
        System.out.println(StringToInt("12324"));

        System.out.println(StringToInt("123e"));
    }

    public static String inToString(int input) {
        return String.valueOf(input);
    }

    public static int StringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " cant be converted to int");
            return 0;
        }

    }
}
