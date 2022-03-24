package Lesson15.betterRoom.MyFirstBooking;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[resultCount(price, persons, city, hotel)];
        int index = 0;
        for (Room room : rooms) {
            if (room != null
                    && persons <= persons + 1
                    && persons >= persons - 1
                    && persons != 0
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)
                    && price == room.getPrice()) {
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
                    && persons <= persons + 1
                    && persons >= Math.max(persons - 1, 1)
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)
                    && price == room.getPrice()) {
                count++;
            }
        }
        return count;
    }
}
