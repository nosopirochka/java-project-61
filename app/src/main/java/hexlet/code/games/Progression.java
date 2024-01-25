package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    static final int MIN_STEP = 1;
    static final int MAX_STEP = 15;
    static final int MIN_START_NUMBER_FOR_PROGRESSION = 1;
    static final int MAX_START_NUMBER_FOR_PROGRESSION = 100;
    public static void run() {
        var messageForGame = "What number is missing in the progression?";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[0], examplesAndAnswers[1]);
    }

    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {

            var lengthForProgression = Utils.getOneNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            var step = Utils.getOneNumber(MIN_STEP, MAX_STEP);
            var first = Utils.getOneNumber(MIN_START_NUMBER_FOR_PROGRESSION, MAX_START_NUMBER_FOR_PROGRESSION);
            var indexOfSpace = Utils.getOneNumber(0, lengthForProgression - 1);
            String[] arrayForProgression = new String[lengthForProgression];
            arrayForProgression[0] = String.valueOf(first);

            for (int j = 1; j < lengthForProgression; j++) {
                arrayForProgression[j] = String.valueOf(first + j * step);
            }

            var answer = arrayForProgression[indexOfSpace];
            arrayForProgression[indexOfSpace] = "..";
            //запись варианта прогрессии в array
            examplesAndAnswers[0][i] = String.join(" ", arrayForProgression);
            //запись ответа в array
            examplesAndAnswers[1][i] = answer;
        }

        return examplesAndAnswers;
    }
}
