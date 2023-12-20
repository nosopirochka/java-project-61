package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public String generateExample() {
        var minValueForNumber = 2;
        var maxValueForNumber = 30;

        return String.valueOf(RandomUtils.nextInt(minValueForNumber, maxValueForNumber));
    }

    public String getAnswer(String answer) {
        var number = Integer.parseInt(answer);
        var stop = number / 2;
        for (int i = 2; i <= stop; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
