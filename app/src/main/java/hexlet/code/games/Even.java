package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Map;
import java.util.HashMap;



public class Even {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 100;


    public static void run() {
        var messageForGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var examplesAndAnswers = generateDataForEven();
        Engine.playGame(messageForGame, examplesAndAnswers);
    }


    public static Map<String, String> generateDataForEven() {
        Map<String, String> examplesAndAnswers = new HashMap<>();
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            var example = String.valueOf(Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER));
            boolean evenOrNot = getAnswerEvenOrNot(example);
            var answer = evenOrNot ? "yes" : "no";
            //recording the answer in Map
            examplesAndAnswers.put(example, answer);
        }
        return examplesAndAnswers;
    }


    public static boolean getAnswerEvenOrNot(String answer) {
        var compareNumber = Integer.parseInt(answer);
        return compareNumber % 2 == 0;
    }
}
