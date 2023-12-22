package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import hexlet.code.Engine;

public class Calc {

    public static void playCalc() {
        var messageForGame = "What is the result of the expression?";
        String[] example = new String[3];
        String[] answers = new String[3];
        var forTry = 3;
        for (var i = 0; i < forTry; i++) {
            var exampleFromGenerate = generateExample();
            example[i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            answers[i] = answerFromGenerate;
        }
        Engine.playGame(messageForGame, example, answers);


    }
    public static String generateExample() {
        var minValueForNumber = 1;
        var maxValueForNumber = 10;
        var number1 = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);
        var number2 = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);

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
