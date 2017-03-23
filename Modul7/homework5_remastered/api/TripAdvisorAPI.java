package homework5_remastered.api;

import homework5_remastered.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Aleksandr on 25.02.2017.
 */
public class TripAdvisorAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(3111, 185, 1, new Date(2016, 11, 22), "Holiday", "Kyiv"));
        rooms.add(new Room(3112, 210, 2, new Date(2016, 11, 22), "Season", "Chernigiv"));
        rooms.add(new Room(3113, 105, 1, new Date(2016, 10, 23), "Apart", "Kyiv"));
        rooms.add(new Room(3114, 200, 2, new Date(2016, 10, 22), "Senator", "Mykolayiv"));
        rooms.add(new Room(22111, 150, 2, new Date(2016, 10, 02), "Palas", "Lviv"));

    }

    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> foundRooms = new ArrayList();
        for (int i = 0; i < rooms.size(); i++)
            /*if ((rooms.get(i).getPrice() <= price || price==0) && (persons == 0 || persons == rooms.get(i).getPersons())
                    &&(city == "" || rooms.get(i).getCityName() == city ) && (hotel == "" || hotel == rooms.get(i).getHotelName())) {
                foundRooms.add(rooms.get(i));*/ {
            if (price >= rooms.get(i).getPrice() && persons == rooms.get(i).getPersons() && rooms.get(i).getCityName() == city && rooms.get(i).getHotelName() == hotel)
                foundRooms.add(rooms.get(i));
        }
        return foundRooms;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}