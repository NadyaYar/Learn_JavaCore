package lesson25.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDao<Order> generalDao = new GeneralDao<>();

        Order order = new Order(12, "something", new Date());

        generalDao.save(order);
        generalDao.save(order);
        System.out.println(Arrays.toString(generalDao.getAll()));

        GeneralDao<User> generalDao1 = new GeneralDao<>();

        User user = new User("Oleh", 18, "Lviv");

        generalDao1.save(user);
        System.out.println(Arrays.toString(generalDao1.getAll()));

        GeneralDao<Room> generalDao2 = new GeneralDao<>();

        Room room = new Room(13,"Lviv","something");

        generalDao2.save(room);
        System.out.println(Arrays.toString(generalDao2.getAll()));

    }
}
