package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

public class Utils {
    public static int generateNumber(int minNumber, int maxNumber) {
        return RandomUtils.nextInt(minNumber, maxNumber);
    }
}
