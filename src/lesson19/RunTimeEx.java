package lesson19;

public class RunTimeEx {
    public static void main(String[] args) {
        // math exception
        mathException(2);

        try {
            mathException(0);
        } catch (ArithmeticException e) {
            System.out.println("something wrong");
        }
        nullPointer(new Object());
        nullPointer(null);
    }

    private static void mathException(int a) {
        System.out.println(10 / a);
    }

    private static void nullPointer(Object o) {
        if (o != null){
            System.out.println(o.hashCode());
        }
    }
}
