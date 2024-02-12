package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    static final int MIN_STEP = 1;
    static final int MAX_STEP = 15;
    static final int MIN_START_NUMBER_FOR_PROGRESSION = 1;
    static final int MAX_START_NUMBER_FOR_PROGRESSION = 100;
    static final int LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER = 2;
    static final int INDEX_OF_EXAMPLE = 0;
    static final int INDEX_OF_ANSWER = 1;


    public static void run() {
        var messageForGame = "What number is missing in the progression?";
        var examplesAndAnswers = generateDataForProgression();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static String[][] generateDataForProgression() {
        String[][] examplesAndAnswers = new String[Engine.COUNT_OF_ROUNDS][LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var lengthOfProgression = Utils.generateNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            var stepOfProgression = Utils.generateNumber(MIN_STEP, MAX_STEP);
            var firstNumberOfProgression = Utils
                    .generateNumber(MIN_START_NUMBER_FOR_PROGRESSION, MAX_START_NUMBER_FOR_PROGRESSION);
            var indexOfSpace = Utils.generateNumber(0, lengthOfProgression - 1);
            var arrayOfProgression = generateProgression(lengthOfProgression,
                    stepOfProgression, firstNumberOfProgression);
            var answer = arrayOfProgression[indexOfSpace];
            arrayOfProgression[indexOfSpace] = "..";
            var example = String.join(" ", arrayOfProgression);
            //recording the example in array
            examplesAndAnswers[i][INDEX_OF_EXAMPLE] = example;
            //recording the answer in array
            examplesAndAnswers[i][INDEX_OF_ANSWER] = answer;
        }
        return examplesAndAnswers;
    }

    public static String[] generateProgression(int lengthOfProgression,
                                                int stepOfProgression,
                                                int firstNumberOfProgression) {
        String[] arrayForProgression = new String[lengthOfProgression];
        for (int j = 0; j < lengthOfProgression; j++) {
            arrayForProgression[j] = String.valueOf(firstNumberOfProgression + j * stepOfProgression);
        }
        return arrayForProgression;
    }
}
