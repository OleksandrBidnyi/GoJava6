package all_tasks.dao;

import all_tasks.Room;

/**
 * Created by Aleksandr on 25.02.2017.
 */
public class DAOImpl implements DAO {

    public Room save(Room room) {
        System.out.println("Save room: " + room);
        return room;
    }

    public boolean delete(Room room) {
        System.out.println("Delete room: " + room);
        return true;
    }

    public Room update(Room room) {
        System.out.println("Update room: " + room);
        return room;
    }

    public Room findById(long id) {
        System.out.println("Found room by id " + id);
        return null;
    }

}
