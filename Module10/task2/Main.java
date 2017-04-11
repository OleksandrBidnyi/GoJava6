package task2;

/**
 * Created by Aleksandr on 09.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        MyException myException = new MyException("Exception of new class");
        System.out.println(myException.getS());

        try{
            throw myException;
        }catch (MyException myExc){
            System.out.println("Catch: " + myExc);
        }finally {
            System.out.println("Request finally block");
        }
        System.out.println("Program has been steel running");

        /*try {
            throw new MyException("My Exception");
        }
        catch(MyException myExc){
            System.out.println("Catch: " + myExc);
        }
        finally {
            System.out.println("Request finally block");
        }*/
    }
}
