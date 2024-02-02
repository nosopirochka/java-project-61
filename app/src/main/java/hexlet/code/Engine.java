package hexlet.code;

import java.util.Scanner;
import java.util.Map;

public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;


    public static void playGame(String message, Map<String, String> examplesAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(message);

        for (var example: examplesAndAnswers.keySet()) {
            System.out.println("Question: " + example);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (examplesAndAnswers.get(example).equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer,
                        examplesAndAnswers.get(example));
                System.out.printf("Let's try again, %s!\n", name);
                scanner.close();
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
}
