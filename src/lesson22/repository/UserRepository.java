package lesson22.repository;

public class UserRepository {
    private static User[] users;

    public static User[] getUsers() {
        return users;
    }

    public static int countUser() {
        int countUser = 0;
        for (User user : users) {
            if (user != null) {
                countUser++;
            }
        }
        return countUser;
    }

    public static String[] getUserNames() {
        String[] namesArray = new String[countUser()];
        int index = 0;
        for (User user : users) {
            if (user != null) {
                namesArray[index] = user.getName();
                index++;
            }
        }
        return namesArray;
    }

    public static long[] getUserIds() {
        long[] idArray = new long[countUser()];
        int index = 0;
        for (User user : users) {
            if (user != null) {
                idArray[index] = user.getId();
                index++;
            }
        }
        return idArray;
    }

    public static String getUserNameByUserIds(long id) {
        for (User user : users) {
            if ((user != null) && (user.getId() == id)) {
                return user.getName();
            }
        }
        return null;
    }

    public static String getUserByName(String name) {
        for (User user : users) {
            if ((user != null) && (user.getName().equals(name))) {
                return name;
            }
        }
        return null;
    }

    public static User findById(long id) {
        for (User user : users) {
            if ((user != null) && (id == user.getId())) {
                return user;
            }
        }
        return null;
    }

    public static User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if ((user != null) && (user.getSessionId().equals(sessionId))) {
                return user;
            }
        }
        return null;
    }

    public static User save(User user1) {
        if (user1 == null
                || findById(user1.getId()) != null
                || isStorageFull()) {
            return null;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user1;
                return users[i];
            }
        }
        return null;
    }

    public static User update(User user) {
        if (user == null
                || findById(user.getId()) != null) return null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == user.getId()) {
                return users[i] = user;
            }
        }
        return null;
    }

    public static void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null)
                    && id == users[i].getId()) {
                users[i] = null;
                break;
            }
        }
    }

    public static boolean isStorageFull() {
        for (User user : users) {
            if (user != null) return false;
        }
        return true;
    }
}



