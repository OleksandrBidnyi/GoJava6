package all_tasks;

import all_tasks.dao.DAO;
import all_tasks.dao.DAOImpl;

import java.util.Date;


/**
 * Created by Aleksandr on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DAO daoImpl = new DAOImpl();
        Room room1 = new Room(12222, 150, 3, new Date(2016, 02, 25), "Hotel", "Odessa");


        System.out.println("Search rooms with parameters:  " + "\n");

        controller.requestRooms(110, 1, "Kyiv", "National");
        controller.requestRooms(200, 1, "Lviv", "Goloseevo");
        controller.requestRooms(200, 2, "Mykolayiv", "Senator");
        System.out.println();


        System.out.println("Check result ");

        System.out.println("Count rooms with same parameters (price, persons and cityName are equal): " + controller.check(controller.apis[0], controller.apis[1]));
        System.out.println("Count rooms with same parameters (price, persons and cityName are equal): " + controller.check(controller.apis[1], controller.apis[2]));
        System.out.println("Count rooms with same parameters (price, persons and cityName are equal): " + controller.check(controller.apis[2], controller.apis[0]));
        
    }
}
