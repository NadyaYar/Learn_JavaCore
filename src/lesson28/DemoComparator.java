package lesson28;

import java.util.ArrayList;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {

        Capability capability1 = new Capability(1111, "test", "rr", false, new Date());
        Capability capability2 = new Capability(12, "test", "rr", true, new Date());
        Capability capability3 = new Capability(109, "test", "rr", true, new Date());

        ArrayList<Capability> capabilities = new ArrayList<>();

        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);

        System.out.println(capabilities);

        capabilities.sort(new isActiveComparator());

        System.out.println(capabilities);
    }
}
