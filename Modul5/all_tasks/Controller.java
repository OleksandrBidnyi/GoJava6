package all_tasks;

import all_tasks.api.API;
import all_tasks.api.BookingComAPI;
import all_tasks.api.GoogleAPI;
import all_tasks.api.TripAdvisorAPI;

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
        Room result[] = new Room[15];
        for (int i = 0, counter = 0; i < apis.length; i++) {
            Room[] roomTemp = apis[i].findRooms(price, persons, city, hotel);
            for (int j = 0; j < roomTemp.length; j++) {
                if (roomTemp[j] != null) {
                    result[counter++] = roomTemp[j];
                    System.out.println(roomTemp[j]);
                }
            }

        }
        return result;
    }

    public int check(API api1, API api2) {
        int result = 0;
        for (Room room : api1.getAllRooms()) {
            for (Room room1 : api2.getAllRooms()) {
                if (room.equals(room1)) {
                    result++;
                }
            }
        }
        return result;
    }
}

