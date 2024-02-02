package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Map;
import java.util.HashMap;


public class Prime {
    static final int MIN_VALUE_FOR_NUMBER = 2;
    static final int MAX_VALUE_FOR_NUMBER = 30;


    public static void run() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var examplesAndAnswers = generateDataForPrime();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static Map<String, String> generateDataForPrime() {
        Map<String, String> examplesAndAnswers = new HashMap<>();
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var example = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
            var answer = getAnswerPrimeOrNot(Integer.parseInt(example)) ? "yes" : "no";
            //recording the answer in Map
            examplesAndAnswers.put(example, answer);
        }
        return examplesAndAnswers;
    }


    public static boolean getAnswerPrimeOrNot(int number) {
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
