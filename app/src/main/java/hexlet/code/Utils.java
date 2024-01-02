package hexlet.code;

import org.apache.commons.lang3.RandomUtils;


public class Utils {
    public static int getOneNumber(int minNumber, int maxNumber) {
        return RandomUtils.nextInt(minNumber, maxNumber);
    }
    public static int[] getTwoNumbers(int minNumber, int maxNumber) {
        int[] arrayOfNumbers = new int[2];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            var randomNumber = RandomUtils.nextInt(minNumber, maxNumber);
            arrayOfNumbers[i] = randomNumber;
        }

        return arrayOfNumbers;
    }
}
