package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 10;
    public static void run() {
        var messageForGame = "What is the result of the expression?";
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

    private static String[] makeExample(String[] signs) {
        String[] array = new String[3];
        array[0] = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
        array[2] = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
        var randomSign = signs[Utils.getOneNumber(0, signs.length - 1)];
        array[1] = randomSign;

        return array;
    }

    public static String generateExample() {
        String[] signs = {"-", "+", "*"};

        return String.join(" ", makeExample(signs));
    }

    public static String getAnswer(String example) {
        var info = example.split(" ");
        if (info[1].equals("+")) {
            return String.valueOf(Integer.parseInt(info[0]) + Integer.parseInt(info[2]));
        } else if (info[1].equals("*")) {
            return String.valueOf(Integer.parseInt(info[0]) * Integer.parseInt(info[2]));
        } else {
            return String.valueOf(Integer.parseInt(info[0]) - Integer.parseInt(info[2]));
        }
    }
}
