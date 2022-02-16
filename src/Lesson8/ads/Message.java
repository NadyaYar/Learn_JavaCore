package Lesson8.ads;

import java.util.Date;

public class Message extends Base{
    User userFrom;
    User userTo;
    Date dateSent;
    Date dateRead;
    String message;

    public Message(long id,User userFrom, User userTo, Date dateSent,  String message) {
        super(id);
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;
    }
   void setDateRead(){
        dateRead = new Date();
    }
    boolean isRead(){
        if (dateRead == null)
            return false;
        return true;
    }
}
