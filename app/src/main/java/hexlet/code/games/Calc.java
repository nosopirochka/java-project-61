package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import hexlet.code.Engine;

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

    public static String generateExample() {
        var numbersForExample = Utils.getTwoNumbers(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
        String[] signs = {"-", "+", "*"};
        var randomSign = signs[Utils.getOneNumber(0, signs.length - 1)];

        return String.format("%d %s %d", numbersForExample[0], randomSign, numbersForExample[1]);
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
