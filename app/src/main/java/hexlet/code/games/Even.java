package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    public static void run() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
            String answerFromGenerate;
            boolean even = makeAnswer(exampleFromGenerate);
            answerFromGenerate = even ? "yes" : "no";
            //запись ответа в array
            examplesAndAnswers[1][i] = answerFromGenerate;
        }

        return examplesAndAnswers;
    }

    public static boolean makeAnswer(String answer) {
        var compareNumber = Integer.parseInt(answer);
        return compareNumber % 2 == 0;
    }
}
