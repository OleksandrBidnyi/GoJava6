package task3;

/**
 * Created by Aleksandr on 10.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        String n = null;
        // n.compareTo(n);
        try {
            n.compareTo(n);
        } catch (NullPointerException nl) {
            System.out.println("Catch: " + nl);
        }
        System.out.println("Program has been steel running");
    }
}
