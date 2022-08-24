package lesson28;

import java.util.Comparator;

public class DataCreatedComparator implements Comparator<Capability> {
    @Override
    public int compare(Capability o1, Capability o2) {
        return o1.getDataCreated().compareTo(o2.getDataCreated());
    }
}
