package lesson10.onlineShop;

import java.util.Date;

public class ElectonicsOrder extends Order {
    private int guaranteeMonths;

    public ElectonicsOrder(String itemName,
                           Date dateCreated,
                           String shipFromCity,
                           String shipToCity,
                           int basePrice,
                           Customer customerOwned,
                           int guaranteeMonths) {
        super(itemName,
                dateCreated,
                shipFromCity,
                shipToCity,
                basePrice,
                customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    public int getGuaranteeMonths() {
        return guaranteeMonths;
    }

    public void setGuaranteeMonths(int guaranteeMonths) {
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    boolean validate() {

        if ((getShipFromCity() == "Odessa"
                || getShipFromCity() == "Kharkiv"
                || getShipFromCity() == "Kyiv"
                || getShipFromCity() == "Dnipro")
                && (getShipToCity() == "Kyiv")
                && (getBasePrice() > 100)
                && (getCustomerOwned().getGender() != "male")) {
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
