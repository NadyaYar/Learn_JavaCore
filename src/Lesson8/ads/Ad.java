package Lesson8.ads;

import java.util.Date;

public class Ad extends Base {
    Date dateCreated;
    int price;

    public Ad( long id,Date dateCreated, int price) {
        super(id);
        this.dateCreated = dateCreated;
        this.price = price;
    }
}
