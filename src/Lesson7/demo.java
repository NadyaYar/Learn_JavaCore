package Lesson7;

import Lesson6.Car;
import Lesson6.User;

public class demo {
    public static void main(String[] args) {
        // class name (type) object name = new class name(attributes)
        // class name (type) object name = new class name()
        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Kate");
        Car car = new Car(10000,2015,"A");
        //--------------------------

    }
}
