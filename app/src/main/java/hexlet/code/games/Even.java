package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;
    static final int LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER = 2;
    static final int INDEX_OF_EXAMPLE = 0;
    static final int INDEX_OF_ANSWER = 1;


    public static void run() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var examplesAndAnswers = generateDataForEven();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static String[][] generateDataForEven() {
        var examplesAndAnswers = new String[Engine.COUNT_OF_ROUNDS][LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var example = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
            boolean evenOrNot = isEven(example);
            var answer = evenOrNot ? "yes" : "no";
            //recording the example in array
            examplesAndAnswers[i][INDEX_OF_EXAMPLE] = example;
            //recording the answer in array
            examplesAndAnswers[i][INDEX_OF_ANSWER] = answer;
        }
        return examplesAndAnswers;
    }


    public static boolean isEven(String answer) {
        var compareNumber = Integer.parseInt(answer);
        return compareNumber % 2 == 0;
    }
}
