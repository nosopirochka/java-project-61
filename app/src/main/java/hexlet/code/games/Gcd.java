package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Gcd {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    static final int LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER = 2;
    static final int INDEX_OF_EXAMPLE = 0;
    static final int INDEX_OF_ANSWER = 1;


    public static void run() {
        var messageForGame = "Find the greatest common divisor of given numbers.";
        var examplesAndAnswers = generateDataForGcd();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static String[][] generateDataForGcd() {
        String[][] examplesAndAnswers = new String[Engine.COUNT_OF_ROUNDS][LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var numberForExample1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var numberForExample2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var example = String.format("%d %d", numberForExample1, numberForExample2);
            var answer = String.valueOf(getGreatestCommonDivisor(numberForExample1, numberForExample2));
            //recording the example in array
            examplesAndAnswers[i][INDEX_OF_EXAMPLE] = example;
            //recording the answer in array
            examplesAndAnswers[i][INDEX_OF_ANSWER] = answer;

        }
        return examplesAndAnswers;
    }


    public static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2  != 0) {
            var number3 = number1 % number2;
            number1 = number2;
            number2  = number3;
        }
        return number1;
    }
}
