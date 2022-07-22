package lesson25.task2;

public class Room {
    private final long id;
    private final String city;
    private final String hotel;

    public Room(long id, String city, String hotel) {
        this.id = id;
        this.city = city;
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }
}
