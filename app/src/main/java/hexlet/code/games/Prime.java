package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 2;
    static final int MAX_VALUE_FOR_NUMBER = 30;
    public static void run() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[0], examplesAndAnswers[1]);
    }

    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {
            var exampleFromGenerate = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
            //запись примера в array
            examplesAndAnswers[0][i] = exampleFromGenerate;
            var number = Integer.parseInt(exampleFromGenerate);
            var answerFromGenerate = makeAnswer(number) ? "yes" : "no";
            //запись ответа в array
            examplesAndAnswers[1][i] = answerFromGenerate;
        }

        return examplesAndAnswers;
    }

    public static boolean makeAnswer(int number) {
        var stop = number / 2;
        for (int i = 2; i <= stop; i++) {
            var result = number % i == 0;
            if (result) {
                return false;
            }
        }

        return true;
    }
}
