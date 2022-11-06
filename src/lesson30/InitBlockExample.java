package lesson30;

public class InitBlockExample {
    private static int a;
    private int b;

    {
        a = 10;
        System.out.println("init non - static. With static variable" + a);
        b = 12;
        System.out.println("Init non - static. With non-static variable" + b);
    }

    static {
        a = 11;
        System.out.println("Init  static. With static variable" + a);
    }

    public static void main(String[] args) {

    }

}
