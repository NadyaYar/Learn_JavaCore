package Lesson15;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File(111, "home/doc/test", "txt");
        File file2 = new File(111, "home/doc/test", "jpg");
        File file3 = new File(111, "home/doc/test", "txt");
        file1.equals(file2); // порівняння
        // stack - змінна посилання на обєкт
        // heap - обєкт
        // змінна це посилання на обєкт
        System.out.println(file1.equals(file2));
        System.out.println(file1.hashCode());
        System.out.println(file3.hashCode());
        System.out.println(file1.equals(file3));
        System.out.println(file1 == file3);

        User user = new User(122);
        System.out.println(file1.equals(user));
    }
}
