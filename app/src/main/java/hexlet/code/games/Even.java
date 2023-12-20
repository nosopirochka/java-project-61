package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {

    public void getMessage() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public String generateExample() {
        int randomNumber = RandomUtils.nextInt(1, 100);
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