package all_tasks.api;

import all_tasks.Room;

import java.util.Date;

/**
 * Created by Aleksandr on 25.02.2017.
 */
public class BookingComAPI implements API {

    Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1111, 100, 1, new Date(2016, 02, 26), "Hilton", "Kyiv");
        rooms[1] = new Room(1112, 200, 2, new Date(2016, 02, 25), "Crystal", "Lviv");
        rooms[2] = new Room(1113, 100, 1, new Date(2016, 05, 05), "Slavutich", "Kyiv");
        rooms[3] = new Room(1114, 200, 2, new Date(2016, 02, 26), "Turist", "Kyiv");
        rooms[4] = new Room(1111, 150, 2, new Date(2016, 11, 05), "Hilton", "Odessa");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[rooms.length];
        for (int i = 0, count = 0; i < rooms.length; i++) {
            if (price >= rooms[i].getPrice() && persons <= rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName()))
                foundRooms[count++] = rooms[i];
        }
        return foundRooms;
    }

    public Room[] getAllRooms() {
        return rooms;
    }


}
