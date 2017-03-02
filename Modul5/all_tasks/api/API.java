package all_tasks.api;

import all_tasks.Room;

/**
 * Created by Aleksandr on 24.02.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    public Room[] getAllRooms();
}
