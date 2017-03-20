package homework5_remastered.api;

import homework5_remastered.Room;

import java.util.ArrayList;

/**
 * Created by Aleksandr on 24.02.2017.
 */
public interface API {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

    ArrayList<Room> getAllRooms();
}
