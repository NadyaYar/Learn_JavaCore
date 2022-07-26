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

    public static String getUserNameByUserIds(long id) throws UserNotFoundException {
        for (User user : arrayList) {
            if ((user.getId() == id)) {
                return user.getName();
            }
        }
        throw new UserNotFoundException("User with id : " + " no found");
    }

    public static String getUserByName(String name) throws UserNotFoundException {
        for (User user : arrayList) {
            if ((user.getName().equals(name))) {
                return name;
            }
        }
        throw new UserNotFoundException("User no found");
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

    public static User update(User user) throws UserNotFoundException, BadRequestExeption {
        for (User user1 : arrayList) {
            if (user1 == findById(user.getId())) {
                user1 = user;
                return user1;
            }
        }
        throw new BadRequestExeption(" User with id: " + user.getId() + "already exist");
    }

    public static void save(User user1) {
        arrayList.add(user1);
    }

    public static void delete(User user) {
        arrayList.remove(user);
    }
}



