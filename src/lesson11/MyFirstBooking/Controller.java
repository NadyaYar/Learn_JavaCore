package lesson11.MyFirstBooking;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[countResult(price, persons, city, hotel)];
        int index = 0;
        for (API api : apis) {
            if (api == null) continue;

            for (Room room1 : api.findRooms(price, persons, city, hotel)) {
                rooms[index] = room1;
                index++;
            }
        }
        return rooms;
    }

    public Room[] check(API api, API api2) {
        if (api == null || api2 == null) return null;
        Room[] rooms = new Room[countRooms(api, api2)];
        int index = 0;
        for (Room room : api.getAl()) {
            if (room == null) continue;

            for (Room room1 : api2.getAl()) {
                if (room.getId() == room1.getId()) {
                    rooms[index] = room;
                }
            }
        }
        return rooms;
    }

    public Room cheapestRoom() {
        Room room = getFirstNotNull();
        if (room == null) return null;

        for (API api : apis) {
            if (api == null) continue;
            for (Room room1 : api.getAl()) {
                if (room1 != null && room.getPrice() > room1.getPrice()) {
                    room = room1;
                }
            }
        }
        return room;
    }

    private int countResult(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API api : apis) {
            if (api != null) {
                count += api.findRooms(price, persons, city, hotel).length;
            }
        }
        return count;
    }

    private int countRooms(API api1, API api2) {
        int count = 0;
        for (Room room : api1.getAl()) {
            if (room == null) continue;
            for (Room room1 : api2.getAl()) {
                if (room.getId() == room1.getId()) {
                    count++;
                }
            }
        }
        return count;
    }

    private Room getFirstNotNull() {
        for (API api : apis) {
            if (api == null) continue;
            for (Room room : api.getAl()) {
                if (room != null) return room;
            }
        }
        return null;
    }
}
