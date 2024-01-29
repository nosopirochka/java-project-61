package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    static final int INDEX_OF_EXAMPLES = 0;
    static final int INDEX_OF_ANSWERS = 1;


    public static void run() {
        var messageForGame = "Find the greatest common divisor of given numbers.";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[INDEX_OF_EXAMPLES], examplesAndAnswers[INDEX_OF_ANSWERS]);
    }


    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][Engine.COUNT_OF_ROUNDS];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var numberForExample1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var numberForExample2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var example = String.format("%d %d", numberForExample1, numberForExample2);
            var answer = String.valueOf(makeAnswer(numberForExample1, numberForExample2));
            //запись примера в array
            examplesAndAnswers[0][i] = example;
            //запись ответа в array
            examplesAndAnswers[1][i] = answer;
        }
        return examplesAndAnswers;
    }


    public static int makeAnswer(int number1, int number2) {
        while (number2  != 0) {
            var number3 = number1 % number2;
            number1 = number2;
            number2  = number3;
        }
        return number1;
    }
}
