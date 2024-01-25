package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final int AMOUNT_OF_EXAMPLES_AND_ANSWERS = 3;
    static final int MIN_VALUE_FOR_NUMBER = 1;
    static final int MAX_VALUE_FOR_NUMBER = 10;
    public static void run() {
        var messageForGame = "What is the result of the expression?";
        var examplesAndAnswers = getData();
        Engine.playGame(messageForGame, examplesAndAnswers[0], examplesAndAnswers[1]);
    }

    public static String[][] getData() {
        var lengthOfArray = 2;
        String[][] examplesAndAnswers = new String[lengthOfArray][AMOUNT_OF_EXAMPLES_AND_ANSWERS];
        for (var i = 0; i < AMOUNT_OF_EXAMPLES_AND_ANSWERS; i++) {
            String[] signs = {"-", "+", "*"};
            var number1 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var number2 = Utils.getOneNumber(MIN_VALUE_FOR_NUMBER, MAX_VALUE_FOR_NUMBER);
            var randomSign = signs[Utils.getOneNumber(0, signs.length - 1)];
            var example = String.format("%d %s %d", number1, randomSign, number2);
            //запись примера в array
            examplesAndAnswers[0][i] = example;
            var info = example.split(" ");
            var answer = switch (info[1]) {
                case "+" -> String.valueOf(Integer.parseInt(info[0]) + Integer.parseInt(info[2]));
                case "*" -> String.valueOf(Integer.parseInt(info[0]) * Integer.parseInt(info[2]));
                default -> String.valueOf(Integer.parseInt(info[0]) - Integer.parseInt(info[2]));
            };
            //запись ответа в array
            examplesAndAnswers[1][i] = answer;
        }

        return examplesAndAnswers;
    }
}
