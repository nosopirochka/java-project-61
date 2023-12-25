package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int ATTEMPTS = 3;
    public static void playGame(String message, String[] gameExamples, String[] gameAnswers) {
        var sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(message);

        for (int i = 0; i < ATTEMPTS; i++) {
            System.out.println("Question: " + gameExamples[i]);
            System.out.print("Your answer: ");
            var answer = sc.next();
            if (gameAnswers[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, gameAnswers[i]);
                System.out.printf("Let's try again, %s!\n", name);
                sc.close();
                return;
            }
        }
        sc.close();
        System.out.println("Congratulations, " + name + "!");
    }
}
