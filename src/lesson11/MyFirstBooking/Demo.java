package lesson11.MyFirstBooking;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room = new Room(123, 500, 1, new Date(), "Kyiv", "Kyiv");
        Room room1 = new Room(124, 20000, 30, new Date(), "Dream", "Lviv");
        Room room2 = new Room(125, 2500, 5, new Date(), "Victoria", "Dnipro");

        Room[] rooms = {room, room1, room2};

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);

        GoogleAPI googleAPI = new GoogleAPI(rooms);

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);

        System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(2000, 3, "Lviv", "Dream")));


        System.out.println(Arrays.toString(bookingComAPI.findRooms(500, 1, "Kyiv", "Kyiv")));


        System.out.println(Arrays.toString(googleAPI.findRooms(500, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.getAl()));

        System.out.println(Arrays.toString(googleAPI.findRooms(500, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.findRooms(499, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.findRooms(3555, 88, "Some", "Some")));


    }
}
