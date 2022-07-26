package lesson20.task1;

import lesson20.task1.exeption.BadRequestExeption;
import lesson20.task1.exeption.UserNotFoundException;

public class UserRepository1 {
    private User1[] users;

    public UserRepository1(User1[] users) {
        this.users = users;
    }

    public User1[] getUsers() {
        return users;
    }

    public int countUser() {
        int countUser = 0;
        for (User1 user : users) {
            if (user != null) {
                countUser++;
            }
        }
        return countUser;
    }

    public String[] getUserNames() {
        String[] namesArray = new String[countUser()];
        int index = 0;
        for (User1 user : users) {
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
        for (User1 user : users) {
            if (user != null) {
                idArray[index] = user.getId();
                index++;
            }
        }
        return idArray;
    }

    public String getUserNameByUserIds(long id) {
        for (User1 user : users) {
            if ((user != null) && (id == user.getId()))
                return user.getName();
        }
        return null;
    }

    public String getUserByName(String name) {
        for (User1 user : users) {
            if ((user != null) && (name.equals(user.getName())))
                return name;
        }
        return null;
    }

    public User1 findById(long id) throws UserNotFoundException {
        for (User1 user : users) {
            if ((user != null) && (id == user.getId()))
                return user;
        }
        throw new UserNotFoundException("User with id" + id + " no found");
    }

    public User1 getUserBySessionId(String sessionId) throws UserNotFoundException {
        for (User1 user : users) {
            if ((user != null) && (sessionId.equals(user.getSessionId())))
                return user;
        }
        throw new UserNotFoundException("User with id" + sessionId + " no found");
    }

    public User1 save(User1 user1) throws BadRequestExeption {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user1;
                return users[i];
            }
        }
        throw new BadRequestExeption(" User with id: " + user1.getId() + "already exist");
    }

    public User1 update(User1 user) throws BadRequestExeption, UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (user != null && users[i] == findById(user.getId())) {
                users[i] = user;
                return users[i];
            }
        }
        throw  new BadRequestExeption(" User with id: " + user.getId() + "already exist");
    }

    public User1[] delete(long id) {
        int nElement = users.length;
        for (int i = 0; i < nElement; i++) {
            if ((users != null) && (id == users[i].getId()))
                users[i] = null;
        }
        return users;
    }
}



