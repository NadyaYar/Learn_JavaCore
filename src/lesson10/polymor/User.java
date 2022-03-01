package lesson10.polymor;

public class User extends human {
    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("user class called..");
        super.run();
    }
}
