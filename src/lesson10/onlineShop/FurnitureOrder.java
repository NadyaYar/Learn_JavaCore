package lesson10.onlineShop;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;
    private Customer customer = new Customer();

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity,
                          String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity,
                shipToCity, basePrice, customerOwned);
    }

    @Override
    boolean validate() {
        if ((getShipFromCity() == "Kyiv"
                || getShipFromCity() == "Lviv")
                && (getBasePrice() > 500)
                && (customer.getName() != "Test")) {
            setDateConfirmed(new Date());
            return true;
        }
        return false;
    }

    @Override
    void calculatePrice() {
        if (getBasePrice() < 5000) {
            setTotalPrice(getBasePrice() + (getBasePrice() * 0.05));
            System.out.println(getTotalPrice());
        } else {
            setTotalPrice(getTotalPrice() + (getBasePrice() * 0.02));
            System.out.println(getTotalPrice());
        }
    }
}
