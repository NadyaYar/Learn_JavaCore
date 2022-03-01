package lesson10.polymor;

public class Child extends human{
    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("child class called..");
        super.run();
    }
}
