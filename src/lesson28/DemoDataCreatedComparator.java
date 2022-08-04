package lesson28;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoDataCreatedComparator {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2012, 2, 23);
        Calendar calendar1 = new GregorianCalendar(2011, 2, 6);
        Calendar calendar2 = new GregorianCalendar(2022, 5, 12);

        Date date = calendar.getTime();
        Date date1 = calendar1.getTime();
        Date date2 = calendar2.getTime();

        Capability capability1 = new Capability(1, "a", "a", true, date);

        Capability capability2 = new Capability(2, "a", "a", true, date1);

        Capability capability3 = new Capability(3, "a", "a", true, date2);

        ArrayList<Capability> capabilities = new ArrayList<>();

        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);

        System.out.println(capabilities);

        capabilities.sort(new DataCreatedComparator());

        System.out.println(capabilities);
    }
}
