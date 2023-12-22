package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void playEven() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        var minValueForNumber = 1;
        var maxValueForNumber = 100;
        int randomNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);

        return String.valueOf(randomNumber);
    }

    public static String getAnswer(String answer) {
        var compareNumber = Integer.parseInt(answer);
        if (compareNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
