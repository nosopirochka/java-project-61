package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String message, String[] gameExamples, String[] gameAnswers) {
        var sc = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.println(message);
        var forTry = 3;
        for (int i = 0; i < forTry; i++) {
            System.out.println("Question: " + gameExamples[i]);
            System.out.print("Your answer: ");
            var answer = sc.next();
            if (gameAnswers[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, gameAnswers[i]);
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
        }
        sc.close();
        System.out.println("Congratulations, " + name + "!");
    }
}
