package Lesson8.phone;

import Lesson8.phone.Phone;

public class Android extends Phone {
    String androidVersion;
    int screenSize;
    String secretDeviseCode;

    public Android(int price, double weight, String countryProduce, String androidVersion, int screenSize, String secretDeviseCode) {
      //  this.price = price;
     //   this.weight = weight;
       // this.countryProduce = countryProduce;
        super(price, weight, countryProduce);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;

    }
    void  installNewVersion(){
        System.out.println("install new version");
    }
}
