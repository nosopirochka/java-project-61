package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public void getMessage() {

        System.out.println("What is the result of the expression?");
    }

    public String generateExample() {
        var number1 = RandomUtils.nextInt(1, 10);
        var number2 = RandomUtils.nextInt(1, 10);
        return String.format("%s %s %s", String.valueOf(number1), Calc.generateSign(), String.valueOf(number2));
    }

    public String getAnswer(String answer) {
        var info = answer.split(" ");
        if (info[1].equals("+")) {
            return String.valueOf(Integer.parseInt(info[0]) + Integer.parseInt(info[2]));
        } else if (info[1].equals("*")) {
            return String.valueOf(Integer.parseInt(info[0]) * Integer.parseInt(info[2]));
        } else {
            return String.valueOf(Integer.parseInt(info[0]) - Integer.parseInt(info[2]));
        }
    }

    static String generateSign() {
        String[] signs = {"-", "+", "*"};
        return signs[RandomUtils.nextInt(0, signs.length - 1)];
    }
}