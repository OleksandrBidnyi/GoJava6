package homework5_remastered;

import homework5_remastered.api.API;
import homework5_remastered.api.BookingComAPI;
import homework5_remastered.api.GoogleAPI;
import homework5_remastered.api.TripAdvisorAPI;

import java.util.ArrayList;

/**
 * Created by Aleksandr on 28.02.2017.
 */
public class Controller {

    ArrayList<API> apis = new ArrayList<>();

    {
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
        apis.add(new BookingComAPI());
    }

    ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> requestRooms = new ArrayList<>();
        for (API api : apis) {
            requestRooms.addAll(api.findRooms(price, persons, city, hotel));
        }
        return requestRooms;
    }

    ArrayList<Room> check(API api1, API api2) {
        ArrayList<Room> roomsApi1 = api1.getAllRooms();
        ArrayList<Room> roomsApi2 = api2.getAllRooms();
        ArrayList<Room> sameRooms = new ArrayList<>();

        for (Room i : roomsApi1) {
            for (Room o : roomsApi2) {
                if (i.equals(o)) {
                    sameRooms.add(o);
                }
            }
        }
        for (Room i : sameRooms) {
            System.out.println("Same rooms: " + i);
        }
        return sameRooms;
    }
}

