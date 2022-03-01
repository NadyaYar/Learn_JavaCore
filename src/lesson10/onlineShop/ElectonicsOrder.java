package lesson10.onlineShop;

import java.util.Date;

public class ElectonicsOrder extends Order {
    int guaranteeMonths;
    Customer customer = new Customer();

    public ElectonicsOrder(String itemName, Date dateCreated, String shipFromCity,
                           String shipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
    }

    @Override
    boolean validate() {

        if ((getShipFromCity() == "Odessa" || getShipFromCity() == "Kharkiv" || getShipFromCity() == "Kyiv" || getShipFromCity() == "Dnipro")
                && (getShipToCity() == "Kyiv")
                && (getBasePrice() > 100)
                && (customer.getGender() != "male")) {
            setDateConfirmed(new Date());
            return true;
        } else {
            return false;
        }
    }

    @Override
    void calculatePrice() {
        if (getShipToCity() == "Kharkiv"
                || getShipToCity() == "Lviv"
                || getShipToCity() == "Dnipro") {
            setTotalPrice(getBasePrice() + (getBasePrice() * 0.15));
        } else {
            setTotalPrice(getBasePrice() + getBasePrice() * 0.1);
        }
        if (getBasePrice() > 1000) {
            setTotalPrice((getBasePrice() + (getBasePrice() * 0.15) * 0.05));
            setTotalPrice((getBasePrice() + (getBasePrice() * 0.1) * 0.05));
        }
        System.out.println(getTotalPrice());
    }
}
