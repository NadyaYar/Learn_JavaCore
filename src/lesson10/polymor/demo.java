package lesson10.polymor;

public class demo {
    public static void main(String[] args) {
        human human = new human("test");
        run(human);
        System.out.println();
        User user = new User("Jack");
        run(user);
    }
    private static void run(human human) {
        human.run();
    }
}
