package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Prime {
    static final int MIN_VALUE_FOR_NUMBER = 2;
    static final int MAX_VALUE_FOR_NUMBER = 30;
    static final int LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER = 2;
    static final int INDEX_OF_EXAMPLE = 0;
    static final int INDEX_OF_ANSWER = 1;


    public static void run() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var examplesAndAnswers = generateDataForPrime();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static String[][] generateDataForPrime() {
        String[][] examplesAndAnswers = new String[Engine.COUNT_OF_ROUNDS][LENGTH_OF_ARRAY_WITH_EXAMPLE_AND_ANSWER];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var example = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
            var answer = isPrime(Integer.parseInt(example)) ? "yes" : "no";
            //recording the example in array
            examplesAndAnswers[i][INDEX_OF_EXAMPLE] = example;
            //recording the answer in array
            examplesAndAnswers[i][INDEX_OF_ANSWER] = answer;
        }
        return examplesAndAnswers;
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        var stopIndex = number / 2;
        for (int i = 2; i <= stopIndex; i++) {
            var result = number % i == 0;
            if (result) {
                return false;
            }
        }
        return true;
    }
}
