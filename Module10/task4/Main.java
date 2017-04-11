package task4;

/**
 * Created by Aleksandr on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Put exception " + e + " in catch block of method f() and catch it in main method");
        }
    }

    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Put exception " + e + " in method g() and catch it in method f() ");
            throw new SecondException();
        }
    }

    static void g() throws Exception {
        throw new FirstException();
    }
}
