package lesson19;

public class ThrowEx {
    private static String[] array = {"-1", "3", null, "5"};

    public static void main(String[] args) {
        // test();
        useOfTestMethod();
    }

    private static void test() throws Exception {
        for (String element : array) {
            if (element == null)
                throw new RuntimeException("null id detected");
        }
        System.out.println("done");
    }

    private static void useOfTestMethod() {
        try {
            test();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
