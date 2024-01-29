package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 10;
    static final int INDEX_OF_EXAMPLES = 0;
    static final int INDEX_OF_ANSWERS = 1;
    static final int LENGTH_OF_ARRAY_WITH_EXAMPLES_AND_ANSWERS = 2;


    public static void run() {
        var messageForGame = "What is the result of the expression?";
        try {
            var examplesAndAnswers = getData();
            Engine.playGame(messageForGame, examplesAndAnswers[INDEX_OF_EXAMPLES], examplesAndAnswers[INDEX_OF_ANSWERS]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static String[][] getData() throws Exception {
        String[][] examplesAndAnswers = new String[LENGTH_OF_ARRAY_WITH_EXAMPLES_AND_ANSWERS][Engine.COUNT_OF_ROUNDS];
        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            String[] signs = {"-", "+", "*", "\\", "\\", "\\"};
            var number1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var number2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var randomSign = signs[Utils.getOneNumber(0, signs.length - 1)];
            var example = String.format("%d %s %d", number1, randomSign, number2);
            var answer = String.valueOf(makeAnswer(number1, number2, randomSign));
            //запись примера в array
            examplesAndAnswers[0][i] = example;
            //запись ответа в array
            examplesAndAnswers[1][i] = answer;
        }
        return examplesAndAnswers;
    }


    public static int makeAnswer(int number1, int number2, String sign) throws Exception {
        return switch (sign) {
            case "+" -> number1 + number2;
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            default -> throw new Exception(String.format("Error: create operation for operator \"%s\"", sign));
        };
    }
}
