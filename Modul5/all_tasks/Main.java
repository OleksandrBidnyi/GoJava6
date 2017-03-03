package all_tasks;

import all_tasks.api.BookingComAPI;
import all_tasks.api.GoogleAPI;
import all_tasks.api.TripAdvisorAPI;

import java.util.Arrays;


/**
 * Created by Aleksandr on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();


        System.out.println("Search rooms with parameters:  " + "\n");

        controller.requestRooms(155, 1, "Kyiv", "National");
        controller.requestRooms(200, 2, "Kharkov", "Dnipro");
        controller.requestRooms(200, 2, "Mykolayiv", "Senator");
        System.out.println();


        System.out.println("Check result: " + "\n");

        System.out.println("GoogleAPI vs TripAdvisorAPI \n"
                + Arrays.toString(controller.check(new GoogleAPI(), new TripAdvisorAPI())));
        System.out.println("BookingComAPI vs GoogleAPI \n"
                + Arrays.toString(controller.check(new BookingComAPI(), new GoogleAPI())));
        System.out.println("TripAdvisorAPI vs GoogleAPI \n"
                + Arrays.toString(controller.check(new TripAdvisorAPI(), new GoogleAPI())));

    }
}
