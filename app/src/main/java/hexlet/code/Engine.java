package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;
    static final int INDEX_OF_EXAMPLE = 0;
    static final int INDEX_OF_ANSWER = 1;


    public static void playGame(String message, String[][] examplesAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(message);

        for (var exampleAndAnswer: examplesAndAnswers) {
            System.out.println("Question: " + exampleAndAnswer[INDEX_OF_EXAMPLE]);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            var trueAnswer = exampleAndAnswer[INDEX_OF_ANSWER];
            if (trueAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer,
                        trueAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                scanner.close();
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
}
