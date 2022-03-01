package lesson10.onlineShop;

import java.util.Date;

public abstract class Order {
    String itemName;
    Date dateCreated;
    Date dateConfirmed;
    Date dateShipped;
    String shipFromCity;
    String shipToCity;
    double basePrice;
    double totalPrice;
    Customer customerOwned;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, double basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    abstract boolean validate();

    abstract void calculatePrice();

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public Customer getCustomerOwned() {
        return customerOwned;

    }
}
