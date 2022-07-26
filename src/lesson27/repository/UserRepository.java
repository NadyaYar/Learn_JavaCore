package lesson27.repository;

import lesson20.task1.exeption.BadRequestExeption;
import lesson20.task1.exeption.UserNotFoundException;

import java.util.ArrayList;

public class UserRepository {

    public static ArrayList<User> arrayList = new ArrayList<>();

    public static ArrayList<String> getUserNames() {
        ArrayList<String> names = new ArrayList<>();
        for (User user : arrayList) {
            String name = user.getName();
            names.add(name);
        }
        return names;
    }

    public static ArrayList<Long> getUserIds() {
        ArrayList<Long> ids = new ArrayList<>();
        for (User user : arrayList) {
            ids.add(user.getId());
        }
        return ids;
    }

    public static String getUserNameByUserIds(long id) {
        for (User user : arrayList) {
            if ((user.getId() == id)) {
                return user.getName();
            }
        }
        return null;
    }

    public static String getUserByName(String name) {
        for (User user : arrayList) {
            if ((user.getName().equals(name))) {
                return name;
            }
        }
        return null;
    }

    public static User findById(long id) throws UserNotFoundException {
        for (User user : arrayList) {
            if ((id == user.getId())) {
                return user;
            }
        }
        throw new UserNotFoundException("User with id" + id + " no found");
    }

    public static User getUserBySessionId(String sessionId) throws UserNotFoundException {
        for (User user : arrayList) {
            if ((user.getSessionId().equals(sessionId))) {
                return user;
            }
        }
        throw new UserNotFoundException("User with id" + sessionId + " no found");
    }

//    public User1 update(User1 user) {
//        for (int i = 0; i < users.length; i++) {
//            if (user != null && users[i] == findById(user.getId())) {
//                users[i] = user;
//                return users[i];
//            }
//        }
//    }

    public static void save(User user1) {
        arrayList.add(user1);
    }

    public static void delete(User user) {
        arrayList.remove(user);
    }
}



