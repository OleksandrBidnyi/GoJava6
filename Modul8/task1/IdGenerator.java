package task1;

import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Aleksandr on 24.03.2017.
 */
public class IdGenerator {

    public static int idGenerate(String name, Country country, int expiration) {
        int id = 1;
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + expiration;
        return result;
    }

}
