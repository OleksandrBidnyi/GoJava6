package homework5_remastered.dao;

import homework5_remastered.Room;

/**
 * Created by Aleksandr on 24.02.2017.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);
}
