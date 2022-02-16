package Lesson8.ads;

import java.util.Date;

public class CarAd extends Ad{
    String model;
    int yearOfManuf;
    String color;
    String ownerName;
    double weight;
    int power;

    public CarAd(long id, Date dateCreated, int price) {
        super(id, dateCreated, price);
    }

    void conFirmAd() {
   }

    }

