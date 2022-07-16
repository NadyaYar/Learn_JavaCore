package lesson22.repository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user = new User(12, "Re", "er1");
        User user1 = new User(1, "Alla", "er12");
        User user2 = new User(13, "Oleh", "er13");
        User user3 = new User(14, "Olya", "er14");

        UserRepository.save(user);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

        UserRepository.update(user3);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
    }
}
