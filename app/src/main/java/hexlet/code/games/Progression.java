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
        var lengthForProgression = Utils.getOneNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
        var step = Utils.getOneNumber(MIN_STEP, MAX_STEP);
        var startNumber = Utils.getOneNumber(MIN_START_NUMBER_FOR_PROGRESSION, MAX_START_NUMBER_FOR_PROGRESSION);

        var minRandomIndex = 0;
        var maxRandomIndex = lengthForProgression - 1;
        var randomIndex = Utils.getOneNumber(minRandomIndex, maxRandomIndex);

        String[] arrayForProgression = new String[lengthForProgression];
        arrayForProgression[0] = String.valueOf(startNumber);

        for (int i = 1; i < lengthForProgression; i++) {
            startNumber += step;
            arrayForProgression[i] = String.valueOf(startNumber);
        }
        arrayForProgression[randomIndex] = "..";

        return String.join(" ", arrayForProgression);
    }

    public static String getAnswer(String answer) {
        var index = 0;
        var arrayFromExample = answer.split(" ");
        for (int i = 0; i < arrayFromExample.length; i++) {
            if (arrayFromExample[i].equals("..")) {
                index = i;
                break;
            }
        }
        return Progression.getDifference(index, arrayFromExample);
    }

    public static String getDifference(int index, String[] progression) {
        if (index <= 1) {
            var number1 = progression[progression.length - 1];
            var number2 = progression[progression.length - 2];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            if (index == 0) {
                return String.valueOf(Integer.parseInt(progression[index + 1]) - diff);
            } else {
                return String.valueOf(Integer.parseInt(progression[index - 1]) + diff);
            }
        } else {
            var number1 = progression[1];
            var number2 = progression[0];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return String.valueOf(Integer.parseInt(progression[index - 1]) + diff);
        }

    }
}
