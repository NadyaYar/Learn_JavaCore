package Lesson8.phone;

import Lesson8.phone.Phone;

public class Iphone extends Phone {
    int price;
    double weight;
    String countryProduce;
    boolean touchPad;

    public Iphone(int price, double weight, String countryProduce, boolean touchPad) {
       // this.price = price;
       // this.weight = weight;
       // this.countryProduce = countryProduce;
        super(price, weight, countryProduce);
        this.touchPad = touchPad;
        System.out.println("Iphone constructor");
    }

    void deleteIphone(){
        System.out.println("delete something");
    }
}
