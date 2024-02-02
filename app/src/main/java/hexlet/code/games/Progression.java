package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.HashMap;
import java.util.Map;


public class Progression {
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    static final int MIN_STEP = 1;
    static final int MAX_STEP = 15;
    static final int MIN_START_NUMBER_FOR_PROGRESSION = 1;
    static final int MAX_START_NUMBER_FOR_PROGRESSION = 100;


    public static void run() {
        var messageForGame = "What number is missing in the progression?";
        var examplesAndAnswers = generateDataForProgression();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static Map<String, String> generateDataForProgression() {
        Map<String, String> examplesAndAnswers = new HashMap<>();
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            var lengthOfProgression = Utils.getOneNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            var stepOfProgression = Utils.getOneNumber(MIN_STEP, MAX_STEP);
            var firstNumberOfProgression = Utils
                    .getOneNumber(MIN_START_NUMBER_FOR_PROGRESSION, MAX_START_NUMBER_FOR_PROGRESSION);
            var indexOfSpace = Utils.getOneNumber(0, lengthOfProgression - 1);
            String[] arrayForProgression = new String[lengthOfProgression];
            arrayForProgression[0] = String.valueOf(firstNumberOfProgression);

            for (int j = 1; j < lengthOfProgression; j++) {
                arrayForProgression[j] = String.valueOf(firstNumberOfProgression + j * stepOfProgression);
            }

            arrayForProgression[indexOfSpace] = "..";
            var example = String.join(" ", arrayForProgression);
            var answer = String.valueOf(searchNumberInSpace(arrayForProgression));
            //recording the answer in Map
            examplesAndAnswers.put(example, answer);
        }
        return examplesAndAnswers;
    }


    public static int searchNumberInSpace(String[] arrayOfExample) {
        var index = ArrayUtils.indexOf(arrayOfExample, "..");
        if (index <= 1) {
            var number1 = arrayOfExample[arrayOfExample.length - 1];
            var number2 = arrayOfExample[arrayOfExample.length - 2];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return index == 0
                    ? Integer.parseInt(arrayOfExample[index + 1]) - diff
                    : Integer.parseInt(arrayOfExample[index - 1]) + diff;
        } else {
            var number1 = arrayOfExample[1];
            var number2 = arrayOfExample[0];
            var stepOfProgression = Integer.parseInt(number1) - Integer.parseInt(number2);
            return Integer.parseInt(arrayOfExample[index - 1]) + stepOfProgression;
        }
    }
}
