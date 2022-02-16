package Lesson8.phone;

public class Phone {
    int price;
    double weight;
    String countryProduce;
    public Phone(int price,double weight,String countryProduce){
        System.out.println("Phone constructor");
        this.price = price;
        this.weight = weight;
        this.countryProduce = countryProduce;
    }
    void orderPhone(){
        // some logic
        System.out.println("order phone");
    }
}
