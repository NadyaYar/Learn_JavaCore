package Lesson15.betterUser.user;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
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

    public long[] getUserIds() {
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
        for (User user : users) {
            if ((user != null) && (user.getId() == id))
                return user.getName();
        }
        return null;
    }

    public String getUserByName(String name) {
        for (User user : users) {
            if ((user != null) && (user.getName().equals(name)))
                return name;
        }
        return null;
    }

    public User findById(long id) {
        for (User user : users) {
            if ((user != null) && (id == user.getId()))
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if ((user != null) && (user.getSessionId().equals(sessionId)))
                return user;
        }
        return null;
    }

    public Object save(User user1) {
        if (user1 == null
                || findById(user1.getId()) != null
                || isStorageFull())
            return null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user1;
                return users[i];
            }
        }
        return null;
    }

    public User update(User user) {
        if (user == null
                || findById(user.getId()) != null) return null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() == user.getId()) {
                return users[i] = user;
            }
        }
        return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null)
                    && id == users[i].getId()) {
                users[i] = null;
                break;
            }
        }
    }

    public boolean isStorageFull() {
        for (User user : users) {
            if (user != null) return false;
        }
        return true;
    }
}



