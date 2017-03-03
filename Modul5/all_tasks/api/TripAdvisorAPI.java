package all_tasks.api;

import all_tasks.Room;

import java.util.Date;

/**
 * Created by Aleksandr on 25.02.2017.
 */
public class TripAdvisorAPI implements API {

    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(3111, 185, 1, new Date(2016, 11, 22), "Holiday", "Kyiv");
        rooms[1] = new Room(3112, 210, 2, new Date(2016, 11, 22), "Season", "Chernigiv");
        rooms[2] = new Room(3113, 105, 1, new Date(2016, 10, 23), "Apart", "Kyiv");
        rooms[3] = new Room(3114, 200, 2, new Date(2016, 10, 22), "Senator", "Mykolayiv");
        rooms[4] = new Room(22111, 150, 2, new Date(2016, 10, 02), "Palas", "Lviv");

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