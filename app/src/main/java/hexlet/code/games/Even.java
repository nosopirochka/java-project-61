package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public String generateExample() {
        var minValueForNumber = 1;
        var maxValueForNumber = 100;
        int randomNumber = RandomUtils.nextInt(minValueForNumber, maxValueForNumber);

        return String.valueOf(randomNumber);
    }

    public String getAnswer(String answer) {
        var compareNumber = Integer.parseInt(answer);
        if (compareNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
