package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 2;
    static final int MAX_VALUE_FOR_NUMBER = 30;
    public static void run() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var examplesAndAnswers = generateData();
        Engine.playGame(messageForGame, examplesAndAnswers[0], examplesAndAnswers[1]);
    }

    public static String[][] generateData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {
            var exampleFromGenerate = generateExample();
            examplesAndAnswers[0][i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            examplesAndAnswers[1][i] = answerFromGenerate;
        }

        return examplesAndAnswers;
    }
    public static String generateExample() {
        return String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
    }

    public static String getAnswer(String answer) {
        var number = Integer.parseInt(answer);
        var stop = number / 2;
        for (int i = 2; i <= stop; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
