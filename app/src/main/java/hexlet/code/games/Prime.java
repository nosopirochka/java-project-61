package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void playPrime() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var arraySize = 3;
        String[] example = new String[arraySize];
        String[] answers = new String[arraySize];
        for (var i = 0; i < arraySize; i++) {
            var exampleFromGenerate = generateExample();
            example[i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            answers[i] = answerFromGenerate;
        }
        Engine.playGame(messageForGame, example, answers);
    }
    public static String generateExample() {
        var minValueForNumber = 2;
        var maxValueForNumber = 30;

        return String.valueOf(RandomUtils.nextInt(minValueForNumber, maxValueForNumber));
    }

    public static String getAnswer(String answer) {
        var number = Integer.parseInt(answer);
        var stop = number / 2;
        for (int i = 2; i <= stop; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
