package lesson11.MyFirstBooking;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAl();

}
