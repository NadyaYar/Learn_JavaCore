package Lesson16;

public class StringUseg {
    public static void main(String[] args) {
     //    String -  послідовність char
        String test = "someString";
        String result = test + "_end";

        System.out.println(result);

        char charVariable = 't';
        char charVariable1 = 'o';

        char [] chars = {charVariable,charVariable1};

        String test1 = new String(chars);
        System.out.println(test1);

        String test2 = new String("hello there");
        System.out.println(test2);
    }
}
