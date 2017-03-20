package homework5_remastered;

import homework5_remastered.api.BookingComAPI;
import homework5_remastered.api.GoogleAPI;
import homework5_remastered.api.TripAdvisorAPI;

import java.util.ArrayList;


/**
 * Created by Aleksandr on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Request rooms: ");
        ArrayList<Room> foundRooms = controller.requestRooms(155, 1, "Kyiv", "National");
        ArrayList<Room> foundRooms2 = controller.requestRooms(200, 2, "Kharkov", "Dnipro");
        ArrayList<Room> foundRooms3 = controller.requestRooms(200, 2, "Mykolayiv", "Senator");
        for (Room r : foundRooms) System.out.println(r);
        for (Room r : foundRooms2) System.out.println(r);
        for (Room r : foundRooms3) System.out.println(r);
        System.out.println();

        System.out.println("Проверяем совпадающие номера в BookingComAPI и TripAdvisorAPI:");
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        System.out.println();

        System.out.println("Проверяем совпадающие номера в BookingComAPI и GoogleAPI:");
        controller.check(new BookingComAPI(), new GoogleAPI());
        System.out.println();

        System.out.println("Проверяем совпадающие номера в TripAdvisorAPI и GoogleAPI:");
        controller.check(new TripAdvisorAPI(), new GoogleAPI());
        System.out.println();
    }
}
