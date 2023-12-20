package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    public String generateExample() {
        var minValueForNumber = 1;
        var maxValueForNumber = 100;

        var firstNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);
        var secondNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);

        return String.format("%d %d", firstNumber, secondNumber);
    }

    public String getAnswer(String answer) {
        var numbers = answer.split(" ");
        var number1 = Integer.parseInt(numbers[0]);
        var number2 = Integer.parseInt(numbers[1]);

        while (number2 != 0) {
            var number3 = number1 % number2;
            number1 = number2;
            number2 = number3;
        }

        return String.valueOf(number1);
    }
}
