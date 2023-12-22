package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    public static void playGcd() {
        var messageForGame = "Find the greatest common divisor of given numbers.";
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
        var minValueForNumber = 1;
        var maxValueForNumber = 100;

        var firstNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);
        var secondNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);

        return String.format("%d %d", firstNumber, secondNumber);
    }

    public static String getAnswer(String answer) {
        var numbers = answer.split(" ");
        var number1 = Integer.parseInt(numbers[0]);
        var number2 = Integer.parseInt(numbers[1]);

        while (number2 != 0) {
            var number3 = number1 % number2;
            number1 = number2;
            number2 = number3;
        }

        return String.valueOf(number1);
    }
}
