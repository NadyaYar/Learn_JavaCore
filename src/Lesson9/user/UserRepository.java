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
            if ((user != null) && (id == user.getId()))
                return user.getName();
        }
        return null;
    }

    public String getUserByName(String name) {
        for (User user : users) {
            if ((user != null) && (name == user.getName()))
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
            if ((user != null) && (sessionId == user.getSessionId()))
                return user;
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
            if (user != null && users[i] == findById(user.getId()))
                users[i] = user;
                return users[i];
        }
        return null;
    }

    public User[] delete(long id) {
        int nElement = users.length;
        for (int i = 0; i < nElement; i++) {
            if ((users != null) && (id == users[i].getId()))
                users[i] = null;

        }
        return users;
    }
}



