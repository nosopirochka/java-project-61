package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import hexlet.code.Engine;

public class Calc {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 10;
    public static void playCalc() {
        var messageForGame = "What is the result of the expression?";
        String[] example = new String[AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        String[] answers = new String[AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {
            var exampleFromGenerate = generateExample();
            example[i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            answers[i] = answerFromGenerate;
        }
        Engine.playGame(messageForGame, example, answers);


    }
    public static String generateExample() {
        var number1 = RandomUtils.nextInt(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
        var number2 = RandomUtils.nextInt(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);

        return String.format("%s %s %s", String.valueOf(number1), Calc.generateSign(), String.valueOf(number2));
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

    public static String generateSign() {
        String[] signs = {"-", "+", "*"};
        return signs[RandomUtils.nextInt(0, signs.length - 1)];
    }
}
