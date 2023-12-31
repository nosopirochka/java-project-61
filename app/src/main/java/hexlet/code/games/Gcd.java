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
            var exampleFromGenerate = getExample();
            examplesAndAnswers[0][i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            examplesAndAnswers[1][i] = answerFromGenerate;
        }

        return examplesAndAnswers;
    }

    private static int makeNumberForGcd() {
        return Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
    }

    public static String getExample() {
        var numberForExample1 = makeNumberForGcd();
        var numberForExample2 = makeNumberForGcd();

        return String.format("%d %d", numberForExample1, numberForExample2);
    }

    public static String getAnswer(String answer) {
        var numbers = answer.split(" ");
        var number1 = Integer.parseInt(numbers[0]);
        var number2 = Integer.parseInt(numbers[1]);

        while (number2 != 0) {
            var number3 = number1 % number2;
            number1 = number2;
            number2 = number3;
        }

        return String.valueOf(number1);
    }
}
