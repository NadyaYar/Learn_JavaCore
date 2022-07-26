package lesson20.task1;

import lesson20.task1.exeption.BadRequestExeption;
import lesson20.task1.exeption.UserNotFoundException;
import lesson27.repository.User;
import lesson27.repository.UserRepository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws BadRequestExeption, UserNotFoundException {

        User1 user = new User1(1, "Kate", "a0");
        User1 user1 = new User1(2, "Den", "a1");
        User1 user2 = new User1(3, "ann", "a2");
        User1 user3 = new User1(4, "Alla", "a3");

        User1[] users = {user, user2, user1};

        UserRepository1 userRepository = new UserRepository1(users);

        System.out.println(Arrays.toString(userRepository.getUserNames()));


        System.out.println(Arrays.toString(userRepository.getUserIds()));

        System.out.println(userRepository.getUserNameByUserIds(1));
//        userRepository.delete(3);
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//
//        userRepository.save(user3);
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//
//
//
//        userRepository.save(null);
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//
//        System.out.println(userRepository.getUserByName("Alla"));
//
        userRepository.update(user1);
        System.out.println(Arrays.toString(userRepository.getUsers()));
//
//        System.out.println(userRepository.findById(4));
//
//        System.out.println(userRepository.getUserBySessionId("a7"));

//        System.out.println(userRepository.getUserNameByUserIds(3));
    }
}
