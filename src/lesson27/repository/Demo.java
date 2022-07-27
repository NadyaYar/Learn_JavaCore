package lesson27.repository;

import lesson20.task1.exeption.BadRequestExeption;
import lesson20.task1.exeption.UserNotFoundException;

public class Demo {
    public static void main(String[] args) throws BadRequestExeption, UserNotFoundException {

        User user1 = new User(1, "Alla", "er12");

        User user2 = new User(3, "Oleh", "er13");

        User user3 = new User(14, "Olya", "er14");

        UserRepository.save(user1);
        UserRepository.save(user2);
        UserRepository.save(user3);

//        System.out.println(UserRepository.users);
//
//        System.out.println(UserRepository.getUserNames());
//
//        System.out.println(UserRepository.getUserIds());
//
//        System.out.println(UserRepository.getUserNameByUserIds(1));
//
//        System.out.println(UserRepository.getUserByName("Alla"));
//
//        System.out.println(UserRepository.findById(1));
//
//        System.out.println(UserRepository.getUserBySessionId("er12"));


        System.out.println(UserRepository.delete(user3));

//        System.out.println(UserRepository.update(user2));

    }
}
