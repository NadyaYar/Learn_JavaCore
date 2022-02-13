package Lesson6;

public class Car {
    int price;
    int year;
    String color;
    String ownerName;
    double weight;
    int power;
    // конструктори constructor

    public Car(int price, int year, String ownerName) {
        this.price = price;
        this.year = year;
        this.ownerName = ownerName;

    }




    // поведения mothods
    void starRun() {
        System.out.println("i am running..");
    }
    void stopRun(){
        System.out.println("i am stopping..");
    }
    void changeOwner(String newOwnerName){
        ownerName = newOwnerName;
    }

}
