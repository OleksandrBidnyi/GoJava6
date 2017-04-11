package task1;

/**
 * Created by Aleksandr on 09.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Catch exception");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally massage");
        }
    }
}
