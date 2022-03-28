package lesson11.MyFirstBooking;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[resultCount(price, persons, city, hotel)];
        int index = 0;
        for (Room room : rooms) {
            if (room != null
                    && persons == room.getPersons()
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)
                    && price <= room.getPrice() + 100
                    && price >= Math.max(price - 100, 0)) {
                result[index] = room;
                index++;
            }
        }
        return result;
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
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)
                    && price <= room.getPrice() + 100
                    && price >= Math.max(price - 100, 0)) {
                count++;
            }
        }
        return count;
    }

}

