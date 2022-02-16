package Lesson8.ads;

import java.util.Date;

public class HouseAd extends Ad {
    String ownerName;
    String adress;
    double square;
    int floors;


    public HouseAd(long id, Date dateCreated, int price, String adress, double square, int floors) {
        super(id, dateCreated, price);
        this.ownerName = ownerName;
        this.adress = adress;
        this.square = square;
        this.floors = floors;
    }
    boolean checkOwner(){
        Owners owners= new Owners();
        for (String owner : owners.owners){
            if (ownerName == owner)
                return true;
        }
        return false;
    }
}
