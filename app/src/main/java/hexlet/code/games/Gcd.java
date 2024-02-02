package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Map;
import java.util.HashMap;


public class Gcd {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;


    public static void run() {
        var messageForGame = "Find the greatest common divisor of given numbers.";
        var examplesAndAnswers = generateDataForGcd();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static Map<String, String> generateDataForGcd() {
        Map<String, String> examplesAndAnswers = new HashMap<>();
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var numberForExample1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var numberForExample2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var example = String.format("%d %d", numberForExample1, numberForExample2);
            var answer = String.valueOf(getGreatestCommonDivisor(numberForExample1, numberForExample2));
            //recording the answer in Map
            examplesAndAnswers.put(example, answer);
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
