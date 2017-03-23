package homework5_remastered.api;

import homework5_remastered.Room;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Aleksandr on 25.02.2017.
 */
public class BookingComAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();


    public BookingComAPI() {
        rooms.add(new Room(1111, 105, 3, new Date(2016, 02, 26), "Hilton", "Kyiv"));
        rooms.add(new Room(1112, 200, 2, new Date(2016, 02, 25), "Crystal", "Lviv"));
        rooms.add(new Room(1113, 129, 1, new Date(2016, 05, 05), "Slavutich", "Kyiv"));
        rooms.add(new Room(1114, 205, 2, new Date(2016, 02, 26), "Turist", "Kyiv"));
        rooms.add(new Room(1111, 150, 2, new Date(2016, 11, 05), "Hilton", "Odessa"));
    }

    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> foundRooms = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++)
            /*if ((rooms.get(i).getPrice() <= price || price==0) && (persons == 0 || persons == rooms.get(i).getPersons())
                    &&(city == "" || rooms.get(i).getCityName() == city ) && (hotel == "" || hotel == rooms.get(i).getHotelName())) {
                foundRooms.add(rooms.get(i));*/
            {
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
