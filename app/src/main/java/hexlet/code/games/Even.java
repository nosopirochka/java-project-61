package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    public static void run() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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

    private static int makeNumber() {
        return Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
    }

    public static String generateExample() {
        var number = makeNumber();

        return String.valueOf(number);
    }

    public static String getAnswer(String answer) {
        var compareNumber = Integer.parseInt(answer);
        return makeAnswer(compareNumber);
    }

    public static String makeAnswer(int number) {
        var result = number % 2 == 0;
        return result? "yes": "no";
    }
}
