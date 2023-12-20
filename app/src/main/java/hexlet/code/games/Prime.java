package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public void getMessage() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public String generateExample() {
        return String.valueOf(RandomUtils.nextInt(2, 30));
    }

    public String getAnswer(String answer) {
        var number = Integer.parseInt(answer);
        var stop = number / 2;
        for (int i = 2; i < stop; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}