package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    public static void run() {
        var messageForGame = "Find the greatest common divisor of given numbers.";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[0], examplesAndAnswers[1]);
    }

    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {
            var numberForExample1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var numberForExample2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            //запись примера в array
            examplesAndAnswers[0][i] = String.format("%d %d", numberForExample1, numberForExample2);

            while (numberForExample2  != 0) {
                var number3 = numberForExample1 % numberForExample2;
                numberForExample1 = numberForExample2 ;
                numberForExample2  = number3;
            }
            //запись ответа в array
            examplesAndAnswers[1][i] = String.valueOf(numberForExample1);
        }

        return examplesAndAnswers;
    }
}
