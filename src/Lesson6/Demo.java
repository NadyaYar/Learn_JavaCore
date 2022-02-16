package Lesson6;

public class  Demo {
    public static void main(String[] args) {
        Car car = new Car(10000, 2015, "A");
        System.out.println(car.color);
        System.out.println(car.power);
        System.out.println(car.ownerName);
        car.power = 100;
        System.out.println(car.power);
   car.starRun();
   car.stopRun();
   car.changeOwner("Test");
        System.out.println(car.ownerName );
        Car caro2 = null;
        System.out.println(caro2);
    }

}
