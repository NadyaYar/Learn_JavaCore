package lesson10.polymor;

public class human {
    private String name;

    public human(String name) {
        this.name = name;
    }

    void run(){
        System.out.println(name + "is running");
    }
}
