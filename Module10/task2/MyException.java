package task2;

/**
 * Created by Aleksandr on 09.04.2017.
 */
public class MyException extends Exception {
    String s;

    public MyException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "s= '" + s + '\'' +
                '}';
    }
}
