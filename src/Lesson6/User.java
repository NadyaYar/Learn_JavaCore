package Lesson6;

import java.util.Date;

public class User {
    String name;
    int age;
    String city;
    Date lastActive;
    boolean isActive;

    public User(String name, int age, String city, Date lastActive, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActive = lastActive;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    void  login() {
        lastActive = new Date();

    }
    void isActive(boolean status){
        isActive = status;
    }
    void  increaseAge(){
        age++;
    }
}

