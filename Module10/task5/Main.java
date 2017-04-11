package task5;

import java.util.Random;

/**
 * Created by Aleksandr on 11.04.2017.
 */
public class Main {

    static void throwsExceptions() throws FirstException, SecondException, ThirdException {
        Integer c = new Random().nextInt(3);
        switch (c) {
            case 0:
                throw new FirstException();

            case 1:
                throw new SecondException();

            case 2:
                throw new ThirdException();
        }
    }

    public static void main(String[] args) {
        try {
            throwsExceptions();
        } catch (FirstException | SecondException | ThirdException e) {
            System.out.println("Catch this exception " + e);
        }


    }
}

