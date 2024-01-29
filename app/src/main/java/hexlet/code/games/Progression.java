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
    static final int INDEX_OF_EXAMPLES = 0;
    static final int INDEX_OF_ANSWERS = 1;


    public static void run() {
        var messageForGame = "What number is missing in the progression?";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[INDEX_OF_EXAMPLES], examplesAndAnswers[INDEX_OF_ANSWERS]);
    }


    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][Engine.COUNT_OF_ROUNDS];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            var lengthForProgression = Utils.getOneNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            var step = Utils.getOneNumber(MIN_STEP, MAX_STEP);
            var first = Utils.getOneNumber(MIN_START_NUMBER_FOR_PROGRESSION, MAX_START_NUMBER_FOR_PROGRESSION);
            var indexOfSpace = Utils.getOneNumber(0, lengthForProgression - 1);
            String[] arrayForProgression = new String[lengthForProgression];
            arrayForProgression[0] = String.valueOf(first);

            for (int j = 1; j < lengthForProgression; j++) {
                arrayForProgression[j] = String.valueOf(first + j * step);
            }

            arrayForProgression[indexOfSpace] = "..";
            var answer = String.valueOf(getAnswer(indexOfSpace, arrayForProgression));
            //запись варианта прогрессии в array
            examplesAndAnswers[0][i] = String.join(" ", arrayForProgression);
            //запись ответа в array
            examplesAndAnswers[1][i] = answer;
        }
        return examplesAndAnswers;
    }


    public static int getAnswer(int index, String[] answer) {
        if (index <= 1) {
            var number1 = answer[answer.length - 1];
            var number2 = answer[answer.length - 2];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return index == 0 ? Integer.parseInt(answer[index + 1]) - diff : Integer.parseInt(answer[index - 1]) + diff;
        } else {
            var number1 = answer[1];
            var number2 = answer[0];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return Integer.parseInt(answer[index - 1]) + diff;
        }
    }
}
