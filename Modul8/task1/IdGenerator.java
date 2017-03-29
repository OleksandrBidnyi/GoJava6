package task1;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Aleksandr on 24.03.2017.
 */
public interface IdGenerator {

    static int randId() {
        int min = 10;
        int max = 259999;

        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
