package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;

    public static void playEven() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        int randomNumber = RandomUtils.nextInt(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);

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
