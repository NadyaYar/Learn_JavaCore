package lesson25.task2;

import java.util.Date;

public class Order {
    private final long id;
    private final String name;
    private final Date date;

    public Order(long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
