package Lesson9.user;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User user = new User(1, "Kate", "a0");
        User user1 = new User(2, "Den", "a1");
        User user2 = new User(3, "ann", "a2");
        User user3 = new User(4, "Alla", "a3");
        User[] users = {user, user1, user2};
        UserRepository userRepository = new UserRepository(users);
        System.out.println(userRepository.getUserByName("Kate"));
        System.out.println(userRepository.getUserNameByUserIds(2));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));
        System.out.println(userRepository.findById(1));
        System.out.println(userRepository.getUserBySessionId("a0"));
        System.out.println(userRepository.save(user3));
        System.out.println(userRepository.update(user1));
        System.out.println(Arrays.toString(userRepository.delete(1)));

    }
}
