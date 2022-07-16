package Lesson15.betterUser.user;

import lesson22.repository.User;
import lesson22.repository.UserRepository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User user = new User(1, "Kate", "a0");
        User user1 = new User(2, "Den", "a1");
        User user2 = new User(3, "ann", "a2");
        User user3 = new User(4, "Alla", "a3");

        User[] users = {user, user2, user1};

        UserRepository userRepository = new UserRepository();

        userRepository.delete(3);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        userRepository.save(user3);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        userRepository.save(null);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        System.out.println(userRepository.getUserByName("Alla"));

        userRepository.update(user1);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        System.out.println(userRepository.findById(4));

        System.out.println(userRepository.getUserBySessionId("a7"));

        System.out.println(userRepository.getUserNameByUserIds(3));
    }
}
