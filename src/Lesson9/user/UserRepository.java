package Lesson9.user;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public int countUser() {
        int countUser = 0;
        for (User user : users) {
            if (user != null) {
                countUser++;
            }
        }
        return countUser;
    }

    public String[] getUserNames() {
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

    public long[] getUserId() {
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

    public String getUserNameByUserIds(long id) {
        if (id == getUserId().length) {
            return getUserNames().toString();
        }
        return null;
    }

    public String getUsetByName(String name) {
        for (User user : users) {
            if (name == user.getName()) {
                return name;
            }
        }
        return null;
    }

    public User findById(long id) {
        for (User user : users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if (sessionId == user.getSessionId()) {
                return user;
            }
        }
        return null;
    }

    public Object save(User user1) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user1;
                return users[i];
            }
        }
        return null;
    }

    public User update(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == findById(user.getId())) {
                users[i] = user;
                return users[i];
            }
        }
        return null;
    }

    public void delete(long id) {
        int nElement = users.length;
        for (int i = 0; i < nElement; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
            }
        }
    }
}



