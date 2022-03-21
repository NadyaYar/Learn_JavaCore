package lesson10.onlineShop;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();

        ElectonicsOrder electonicsOrder = new ElectonicsOrder("Phone", new Date(),
                "Kyiv", "Kyiv", 1000, customer, 12);
        FurnitureOrder furnitureOrder = new FurnitureOrder("Phone", new Date(),
                "Kyiv", "Kyiv", 1000, customer, "something");


        System.out.println(electonicsOrder.validate());
        System.out.println(furnitureOrder.validate());

        electonicsOrder.calculatePrice();
        furnitureOrder.calculatePrice();
    }
}
