package lesson10.onlineShop;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setGender("female");
        customer.setName("Test");
        customer.setCity("Kyiv");
        ElectonicsOrder electonicsOrder = new ElectonicsOrder("Phone", new  Date(),
                "Kyiv", "Kyiv", 1234, customer);
       FurnitureOrder furnitureOrder = new FurnitureOrder("Phone", new Date(),
                "Kyiv", "Kyiv", 1234, customer);
        System.out.println(electonicsOrder.validate());
        System.out.println(furnitureOrder.validate());
        electonicsOrder.calculatePrice();
        furnitureOrder.calculatePrice();
    }
}
