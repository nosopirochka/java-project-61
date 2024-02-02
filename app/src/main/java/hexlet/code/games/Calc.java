package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Map;
import java.util.HashMap;


public class Calc {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 10;


    public static void run() {
        var messageForGame = "What is the result of the expression?";
        try {
            var examplesAndAnswers = generateDataForCalc();
            Engine.playGame(messageForGame, examplesAndAnswers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static Map<String, String> generateDataForCalc() throws Exception {
        Map<String, String> examplesAndAnswers = new HashMap<>();
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] signs = {"-", "+", "*"};
            var numberForExample1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var numberForExample2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var randomSign = signs[Utils.getOneNumber(0, signs.length - 1)];
            var example = String.format("%d %s %d", numberForExample1, randomSign, numberForExample2);
            var answer = String.valueOf(calculate(numberForExample1, numberForExample2, randomSign));
            //recording the answer in Map
            examplesAndAnswers.put(example, answer);
        }
        return examplesAndAnswers;
    }


    public static int calculate(int number1, int number2, String sign) throws Exception {
        return switch (sign) {
            case "+" -> number1 + number2;
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            default -> throw new Exception(String.format("Error: create operation for operator \"%s\"", sign));
        };
    }
}
