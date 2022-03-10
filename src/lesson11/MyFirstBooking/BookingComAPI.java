package lesson11.MyFirstBooking;

import java.util.Arrays;

public class BookingComAPI implements API {
    private Room[] rooms;

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[resultCount(price, persons, city, hotel)];
        int index = 0;
        for (Room room : rooms) {
            if (room != null
                    && persons == room.getPersons()
                    && city == room.getCityName()
                    && hotel == room.getHotelName()
                    && price <= price + 100
                    && price >= Math.max(price - 100, 0)) {
                rooms[index] = room;
                index++;
            }
        }
        return rooms;
    }

    @Override
    public Room[] getAl() {
        return rooms;
    }

    private int resultCount(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null
                    && persons == room.getPersons()
                    && city == room.getCityName()
                    && hotel == room.getHotelName()
                    && price <= price + 100
                    && price >= Math.max(price - 100, 0)) {
                count++;
            }
        }
        return count;
    }

}

