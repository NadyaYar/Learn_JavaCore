package Lesson16;

public class StringCompare {
    public static void main(String[] args) {
        System.out.println( new String("abc") == new String("abs"));
       // pool string область памяті в які попадає всі стрінгі як створені не через new
        System.out.println("abs".equals("abs"));

        String s1 = "test";
        String s2 = "test";

    }
}
