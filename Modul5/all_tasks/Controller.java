package all_tasks;

import all_tasks.api.API;
import all_tasks.api.BookingComAPI;
import all_tasks.api.GoogleAPI;
import all_tasks.api.TripAdvisorAPI;

import java.util.Arrays;

/**
 * Created by Aleksandr on 28.02.2017.
 */
public class Controller {

    API apis[] = new API[3];

    {
        apis[0] = new GoogleAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new BookingComAPI();

    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[0];
        for (int i = 0, counter = 0; i < apis.length; i++) {
            Room[] roomTemp = apis[i].findRooms(price, persons, city, hotel);
            for (int j = 0; j < roomTemp.length; j++) {
                if (roomTemp[j] != null) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[counter++] = roomTemp[j];
                    System.out.println(roomTemp[j]);
                }
            }
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] sameRooms = new Room[0];
        for (int i = 0; i < api1.getAllRooms().length; i++) {
            for (int j = 0; j < api2.getAllRooms().length; j++) {
                if (api1.getAllRooms()[i].equals(api2.getAllRooms()[j])) {
                    sameRooms = Arrays.copyOf(sameRooms, sameRooms.length + 1);
                    sameRooms[sameRooms.length - 1] = api1.getAllRooms()[i];
                }
            }
        }
        return sameRooms;
    }
}

