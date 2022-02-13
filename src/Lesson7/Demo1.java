package Lesson7;

import Lesson6.Deal;

import java.util.Date;

public class Demo1 {
    public Deal createDeal() {
 return new Deal(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    public Deal createDealAndCallMethods() {
        Deal deal = new Deal(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        deal.setConfirmOder();
        deal.checkPrice();
        deal.isValidType();
        return deal;
    }
}
