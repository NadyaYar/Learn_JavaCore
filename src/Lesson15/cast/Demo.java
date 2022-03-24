package Lesson15.cast;

public class Demo {
    public static void main(String[] args) {
        // cast використовується для  приведення більш широкого типу до вужчого
        InternetProvider provider = (InternetProvider) test();
        FoodProvider foodProvider = (FoodProvider) testFood();

        System.out.println(provider);
    }

    private static Provider test() {
        return new InternetProvider();
    }

    private static Provider testFood() {

        return new InternetProvider();
    }
}
